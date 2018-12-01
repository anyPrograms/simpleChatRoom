package com.simpleChatRoom.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleChatRoom.Daos.IuserDao;
import com.simpleChatRoom.Module.UserBean;
import com.simpleChatRoom.Po.UserPo;
import com.simpleChatRoom.Utils.BeanConvertUtils;

import java.util.List;

@Service
public class UserService {

	@Autowired
	IuserDao userDao;
	
	/*
	@Transactional
	public void saveUsersAsMember(String teamName, List<String> users) {
		List<MetaTeamMember> oldmembers = memberRepo.findListByTeamName(teamName);
		
		 //清空团队的成员
		memberRepo.deleteByTeamName(teamName);

		// 重新保存成员
		for (String u : users) {
			MetaTeamMember tmember = new MetaTeamMember();
			tmember.setState(ValidStatConstant.VALID);
			tmember.getTeam().setName(teamName);
			tmember.setUserId(u);

			MetaUserPo user = userRepo.findOne(u);
			if (user == null) {
				//如果用户不存在就跳过
				continue;
			}

			for (MetaTeamMember m1 : oldmembers) {
				if (m1.getUserId().equals(u)) {
					tmember = BeanConvertUtils.copyBean(m1, MetaTeamMember.class);
					tmember.setId(m1.getId());
					tmember.setName(m1.getName());
					tmember.setLabel(m1.getLabel());
					tmember.setDescr(m1.getDescr());
					tmember.getTenant().setId(m1.getTenant().getId());
					tmember.setState(m1.getState());
					String date =m1.getCreateDate();
					tmember.setCreateDate(date);
				}
			}

			if (null == tmember.getName() || "".equals(tmember.getName())) {
				tmember.setName("developer");
				tmember.setLabel("开发人员");
			}

//			if (null == tmember.getTenantId() || "".equals(tmember.getTenantId())) {
//				MetaTenant tenant = createTenant(team, user);
//				tmember.setTenantId(tenant.getId());
//			}

			memberRepo.save(tmember);
		}
	}
	
	private MetaTenant createTenant(MetaTeam team, MetaUserPo user){
		MetaTenant tenant = new MetaTenant();
		tenant.setName(team.getName() + "-" + user.getId());
		tenant.setLabel(team.getLabel() + "-" + user.getName() + "-租户");
		tenant.setState(ValidStatConstant.VALID);
		MetaTenant tenant1 = tenantRepo.save(tenant);
		return tenant1;
	}
	
	@Transactional
	public void saveUserAsMember(String teamId, MetaUserPo user, String roleId, String roleName) {
		MetaUserPo user1 = userRepo.save(user);
//		MetaTeam team = teamRepo.findOneById(teamId);
//		MetaTenant tenant = createTenant(team, user1);
		
		MetaTeamMember tmember = new MetaTeamMember();
		tmember.setState(ValidStatConstant.VALID);
		tmember.getTeam().setId(teamId);
		tmember.setUserId(user1.getId());
//		tmember.setTenantId(tenant.getId());
		tmember.setName(roleId);
		tmember.setLabel(roleName);
		tmember.setIsDefault("0");
		memberRepo.save(tmember);
		
	}
	
	@Transactional
	public void updateTeamTenants(String teamId, List<MetaTeamMember> members) {
		for (MetaTeamMember member : members) {
			if(member.getTenant()==null) {
				memberRepo.updateTenantById(member.getId(),"");				
			}else {
				memberRepo.updateTenantById(member.getId(), member.getTenantName());
			}
		}
	}
	
	@Transactional
	public void invalidateMembers(String teamName, List<MetaTeamMember> members) {
		for (MetaTeamMember member : members) {
			memberRepo.invalidate(member.getId());
		}
	}
	*/
	
	public UserBean getUser(String userName) {
		UserPo userPo = userDao.getUser(userName);
		UserBean user = BeanConvertUtils.copyBean(userPo, UserBean.class);
		return user;
	}
	public UserBean checkin(String userName,String pwd) {
		
		
		return null;
		
	}
	public void saveUser(String userName,String pwd,String age,String city,String desc) {
		
	}
}
