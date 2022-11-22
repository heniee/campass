package com.campass.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.campass.demo.dto.CampingDto;
import com.campass.demo.dto.SearchDto;
import com.campass.demo.dto.CampingDto.CListDto;
import com.campass.demo.entity.CArea;
import com.campass.demo.entity.Camping;
import com.campass.demo.entity.Heart;


@Mapper
public interface CampingDao {
	//-------------------판매자-------------------------------
	// 캠핑장 등록
	public Integer save(Camping camping);
	
	// 캠핑장 개수(페이징)
	public Integer count();
	
	//판매자가쓴 캠핑장 리스트 불러오기
	public List<CampingDto.CListDto> findAll(Map map);
	
	//캠핑장이름 가져오기
	public String getcNameById(Integer cCode);
	
	//캠핑존이름 가져오기
	public String getczNameById(Integer czCode);
	
	//캠핑장 업데이트
	public Integer update(Camping camping);
	
	// 캠핑장 읽기
	public Camping findById(Integer cCode);
	
	//캠핑장 변경 삭제전에 sId를 확인하기위한 절차 
	public Optional<String> findWriterById(Integer cCode);
	
	// 캠핑장 삭제
	public Integer deleteById(Integer cCode);
	
	//-------------------판매자-------------------------------
	
	
	//==========구매자======================================
	
	//일반 캠핑장 리스트 불러오기
	public List<CampingDto.CListDto> BBfindAll(Integer startRownum, Integer endRownum);
	
	// 캠핑장 읽기
	public Camping BBfindById(Integer cCode);
	
	
	//검색결과 게시물개수구하기
	public int getCampListCnt(Map<String,Object> map);
	
	//하트
	public ArrayList<Heart> getHeartList(String loginId);
	
	//홈 -조회  캠핑리스트 (메인DAO) 존나중요 
	public List<CampingDto.CListDto> campingList(Map map);

}
