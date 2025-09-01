// Description: Java 11 Object interface for CFBam Index.

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

public interface ICFBamIndexObj
	extends ICFBamScopeObj
{
	/**
	 *	Get the current edition of this Index instance as a ICFBamIndexEditObj.
	 *
	 *	@return	The ICFBamIndexEditObj edition of this instance.
	 */
	ICFBamIndexEditObj getEditAsIndex();

	/**
	 *	Get the ICFBamIndexTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamIndexTableObj table cache which manages this instance.
	 */
	ICFBamIndexTableObj getIndexTable();

	/**
	 *	Get the CFBamIndexBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamIndexBuff instance which currently backs this object.
	 */
	CFBamIndexBuff getIndexBuff();

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
	 *	Get the required boolean attribute IsUnique.
	 *
	 *	@return	The required boolean attribute IsUnique.
	 */
	boolean getRequiredIsUnique();

	/**
	 *	Get the required boolean attribute IsDbMapped.
	 *
	 *	@return	The required boolean attribute IsDbMapped.
	 */
	boolean getRequiredIsDbMapped();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable( boolean forceRead );

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
	 *	Get the array of optional ICFBamIndexColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamIndexColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamIndexColObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional ICFBamIndexColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamIndexColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamIndexColObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the required ICFBamTenantObj instance referenced by the IdxTenant key.
	 *
	 *	@return	The required ICFBamTenantObj instance referenced by the IdxTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerIdxTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the IdxTenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the IdxTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerIdxTenant( boolean forceRead );

}
