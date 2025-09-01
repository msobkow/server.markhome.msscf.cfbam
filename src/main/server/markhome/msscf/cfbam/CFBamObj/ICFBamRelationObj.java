// Description: Java 11 Object interface for CFBam Relation.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.msscf.cfbam.CFBam.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamRelationObj
	extends ICFBamScopeObj
{
	/**
	 *	Get the current edition of this Relation instance as a ICFBamRelationEditObj.
	 *
	 *	@return	The ICFBamRelationEditObj edition of this instance.
	 */
	ICFBamRelationEditObj getEditAsRelation();

	/**
	 *	Get the ICFBamRelationTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamRelationTableObj table cache which manages this instance.
	 */
	ICFBamRelationTableObj getRelationTable();

	/**
	 *	Get the CFBamRelationBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamRelationBuff instance which currently backs this object.
	 */
	CFBamRelationBuff getRelationBuff();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

	/**
	 *	Get the optional Long attribute DefSchemaTenantId.
	 *
	 *	@return	The optional Long attribute DefSchemaTenantId.
	 */
	Long getOptionalDefSchemaTenantId();

	/**
	 *	Get the optional Long attribute DefSchemaId.
	 *
	 *	@return	The optional Long attribute DefSchemaId.
	 */
	Long getOptionalDefSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required ICFBamSchema.RelationTypeEnum attribute RelationType.
	 *
	 *	@return	The required ICFBamSchema.RelationTypeEnum attribute RelationType.
	 */
	ICFBamSchema.RelationTypeEnum getRequiredRelationType();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Get the required long attribute FromIndexId.
	 *
	 *	@return	The required long attribute FromIndexId.
	 */
	long getRequiredFromIndexId();

	/**
	 *	Get the required long attribute ToTableId.
	 *
	 *	@return	The required long attribute ToTableId.
	 */
	long getRequiredToTableId();

	/**
	 *	Get the required long attribute ToIndexId.
	 *
	 *	@return	The required long attribute ToIndexId.
	 */
	long getRequiredToIndexId();

	/**
	 *	Get the required boolean attribute IsRequired.
	 *
	 *	@return	The required boolean attribute IsRequired.
	 */
	boolean getRequiredIsRequired();

	/**
	 *	Get the required boolean attribute IsXsdContainer.
	 *
	 *	@return	The required boolean attribute IsXsdContainer.
	 */
	boolean getRequiredIsXsdContainer();

	/**
	 *	Get the required boolean attribute IsLateResolver.
	 *
	 *	@return	The required boolean attribute IsLateResolver.
	 */
	boolean getRequiredIsLateResolver();

	/**
	 *	Get the required boolean attribute AllowAddendum.
	 *
	 *	@return	The required boolean attribute AllowAddendum.
	 */
	boolean getRequiredAllowAddendum();

	/**
	 *	Get the optional Long attribute NarrowedTenantId.
	 *
	 *	@return	The optional Long attribute NarrowedTenantId.
	 */
	Long getOptionalNarrowedTenantId();

	/**
	 *	Get the optional Long attribute NarrowedId.
	 *
	 *	@return	The optional Long attribute NarrowedId.
	 */
	Long getOptionalNarrowedId();

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Get the required ICFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the FromTable key.
	 */
	ICFBamTableObj getRequiredContainerFromTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the FromTable key.
	 */
	ICFBamTableObj getRequiredContainerFromTable( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamRelationColObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional ICFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamRelationColObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopTopDepObj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopTopDepObj> getOptionalComponentsPopDep( boolean forceRead );

	/**
	 *	Get the required ICFBamTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required ICFBamTenantObj instance referenced by the RelTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerRelTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the RelTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerRelTenant( boolean forceRead );

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamIndexObj getRequiredLookupFromIndex();

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamIndexObj getRequiredLookupFromIndex( boolean forceRead );

	/**
	 *	Get the required ICFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ToTable key.
	 */
	ICFBamTableObj getRequiredLookupToTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ToTable key.
	 */
	ICFBamTableObj getRequiredLookupToTable( boolean forceRead );

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamIndexObj getRequiredLookupToIndex();

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamIndexObj getRequiredLookupToIndex( boolean forceRead );

	/**
	 *	Get the optional ICFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional ICFBamRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamRelationObj getOptionalLookupNarrowed();

	/**
	 *	Get the optional ICFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional ICFBamRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamRelationObj getOptionalLookupNarrowed( boolean forceRead );

	ICFBamSubProjectObj getProject();
	ICFBamTopDomainObj getCompany();
	ICFBamSchemaDefObj getSchemaDef();
	ICFBamMinorVersionObj getVersion();
	String getVersionString();
	String getPackedVersionString();
	Boolean isColumnInOwnerRelation();

}
