package org.greenscape.organization.service.impl;

import java.util.Collection;

import org.greenscape.organization.OrganizationEntity;
import org.greenscape.organization.persistence.OrganizationPersistence;
import org.greenscape.organization.service.OrganizationService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class OrganizationServiceImpl implements OrganizationService {

	private OrganizationPersistence organizationPersistence;

	@Override
	public OrganizationEntity findById(Object id) {
		return organizationPersistence.findById(id);
	}

	@Override
	public OrganizationEntity findByOrganizationId(long orgId) {
		return organizationPersistence.findByOrganizationId(orgId);
	}

	@Override
	public Collection<OrganizationEntity> findAll() {
		return organizationPersistence.findAll();
	}

	@Override
	public OrganizationEntity save(OrganizationEntity organizationEntity) {
		return organizationPersistence.save(organizationEntity);
	}

	@Override
	public void deleteByOrganizationId(long orgId) {
		organizationPersistence.deleteByOrganizationId(orgId);
	}

	@Reference
	public void setOrganizationPersistence(OrganizationPersistence persistence) {
		this.organizationPersistence = persistence;
	}

	public void unsetOrganizationPersistence(OrganizationPersistence persistence) {
		this.organizationPersistence = null;
	}

}