package com.simpleChatRoom.Daos;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.simpleChatRoom.Po.ChatHistoryPo;

import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IchatHistoryDao extends JpaRepository<ChatHistoryPo, String>, JpaSpecificationExecutor<ChatHistoryPo> {

	/*@Query("select p from MetaUserPo p where p.teamName like  %:teamName% or p.label like %:teamName% order by p.createDt desc")
	Page<MetaUserPo> findListByTeamName(@Param("teamName") String teamName, Pageable pageable);
	
	@Query("select p from MetaUserPo p where p.teamName =:teamName")
	MetaUserPo findOneByTeamName(@Param("teamName") String teamName);

	@Query("select p from MetaUserPo p where p.id in(:ids)")
	List<MetaUserPo> findListByIds(@Param("ids") List<String> ids);

	@Transactional
	@Modifying
	@Query("update MetaUserPo p set p.archName=:archName where p.id=:id")
	void updateArchNameById(@Param("archName") String archName, @Param("id") String id);
	 */
	
	@Query("select p from IchatHistoryPo p where p.account =:account")
	ChatHistoryPo getHistoryByUser(@Param("account") String account);

	
}
