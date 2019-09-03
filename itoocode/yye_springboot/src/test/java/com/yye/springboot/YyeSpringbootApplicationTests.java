package com.yye.springboot;

import com.github.pagehelper.PageInfo;
import com.yye.springboot.dao.PaperRecordDao;
import com.yye.springboot.dao.RedisDao;
import com.yye.springboot.entity.PaperRecordEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YyeSpringbootApplicationTests {


	@Autowired
	PaperRecordDao paperRecordDao;
		@Autowired
	private RedisDao redisDao;



	@Test
	public void testRedis(){
		redisDao.setKey("name","yangyuee");
		redisDao.setKey("age","11");
		System.out.println(redisDao.getValue("name"));
		System.out.println(redisDao.getValue("age"));
	}

	//}

	@Test
	public  void getqueryLikeExamineeId(){
		List<PaperRecordEntity> paperRecordEntityList = paperRecordDao.queryLikeExamineeId("112w");
		paperRecordEntityList.forEach(v-> System.out.println(v.getQuestionMainId()));
		}

		@Test
		public void testList(){
		List<String> list = new ArrayList<>();
		list.add("1");

		addlist(list);
		list.forEach(v-> System.out.println("我是第一个list："+v));

		}
		public void addlist(List<String> list){
			Map<String,String> map = new HashMap<>();
			//list= new ArrayList<>();
			list.add("2");
			list.forEach(v-> System.out.println("我是第二个list："+v));
		}

		@Test
	public  void testInt(){
			int i = 9;
			changeInt(i);
			System.out.println("我是第一个i:"+i);
		}
		public  void changeInt(int i){
		i=10;
			System.out.println("我是第二个i:"+ i);
		}

 }
