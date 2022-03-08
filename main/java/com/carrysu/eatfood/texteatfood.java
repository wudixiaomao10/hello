package com.carrysu.eatfood;


import com.carrysu.eatfood.utils.DBUtils;
import com.carrysu.eatfood.mapper.EatfoodMapper;
import com.carrysu.eatfood.entity.Eatfood;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class texteatfood {
    //查询
    public static void searchFood(String food) {
        SqlSessionFactory factory = DBUtils.obtionSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        EatfoodMapper eatfoodMapper = sqlSession.getMapper(EatfoodMapper.class);
        Eatfood rfs = eatfoodMapper.selectFood(food);
        System.out.println(rfs);
    }

    //增
    public static void addFood(int id, String food, String window) {
        SqlSessionFactory factory = DBUtils.obtionSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        EatfoodMapper eatfoodMapper = sqlSession.getMapper(EatfoodMapper.class);
        Eatfood rf = new Eatfood(id, food, window);
        //返回值是修改条目的数量
        int cnt = eatfoodMapper.addFood(rf);
        sqlSession.commit();
        System.out.println("新增了" + cnt + "个记录");
    }

   //改
    public static void updateFood(int id, String food, String window){
        SqlSessionFactory factory = DBUtils.obtionSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        EatfoodMapper eatfoodMapper = sqlSession.getMapper(EatfoodMapper.class);
        Eatfood rf = new Eatfood(1, "小笼包", "B窗口");
        eatfoodMapper.updateFood(rf);
        sqlSession.commit();
    }
  //删
  public  static void  deleteFood(Eatfood rf){
      SqlSessionFactory factory = DBUtils.obtionSqlSessionFactory();
      SqlSession sqlSession = factory.openSession();
      EatfoodMapper eatfoodMapper = sqlSession.getMapper(EatfoodMapper.class);
      String food = "carrysu";
      eatfoodMapper.deleteFood(food);
      sqlSession.commit();
  }

    public static void main(String[] args) {
        addFood(6, "米线", "A窗口");
        searchFood("carrysu");
        updateFood(1,"小笼包","B窗口");
    }
}