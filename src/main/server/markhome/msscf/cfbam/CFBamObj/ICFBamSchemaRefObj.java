// Description: Java 11 Object interface for CFBam SchemaRef.

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

public interface ICFBamSchemaRefObj
	extends ICFBamScopeObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	ICFBamSchemaRefObj the reference to the moved and refreshed instance.
	 */
	ICFBamSchemaRefObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	ICFBamSchemaRefObj the reference to the moved and refreshed instance.
	 */
	ICFBamSchemaRefObj moveDown();

	/**
	 *	Get the current edition of this SchemaRef instance as a ICFBamSchemaRefEditObj.
	 *
	 *	@return	The ICFBamSchemaRefEditObj edition of this instance.
	 */
	ICFBamSchemaRefEditObj getEditAsSchemaRef();

	/**
	 *	Get the ICFBamSchemaRefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamSchemaRefTableObj table cache which manages this instance.
	 */
	ICFBamSchemaRefTableObj getSchemaRefTable();

	/**
	 *	Get the CFBamSchemaRefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamSchemaRefBuff instance which currently backs this object.
	 */
	CFBamSchemaRefBuff getSchemaRefBuff();

	/**
	 *	Get the required long attribute SchemaId.
	 *
	 *	@return	The required long attribute SchemaId.
	 */
	long getRequiredSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required String attribute RefModelName.
	 *
	 *	@return	The required String attribute RefModelName.
	 */
	String getRequiredRefModelName();

	/**
	 *	Get the required String attribute IncludeRoot.
	 *
	 *	@return	The required String attribute IncludeRoot.
	 */
	String getRequiredIncludeRoot();

	/**
	 *	Get the optional Long attribute RefSchemaTenantId.
	 *
	 *	@return	The optional Long attribute RefSchemaTenantId.
	 */
	Long getOptionalRefSchemaTenantId();

	/**
	 *	Get the optional Long attribute RefSchemaId.
	 *
	 *	@return	The optional Long attribute RefSchemaId.
	 */
	Long getOptionalRefSchemaId();

	/**
	 *	Get the optional Long attribute PrevTenantId.
	 *
	 *	@return	The optional Long attribute PrevTenantId.
	 */
	Long getOptionalPrevTenantId();

	/**
	 *	Get the optional Long attribute PrevId.
	 *
	 *	@return	The optional Long attribute PrevId.
	 */
	Long getOptionalPrevId();

	/**
	 *	Get the optional Long attribute NextTenantId.
	 *
	 *	@return	The optional Long attribute NextTenantId.
	 */
	Long getOptionalNextTenantId();

	/**
	 *	Get the optional Long attribute NextId.
	 *
	 *	@return	The optional Long attribute NextId.
	 */
	Long getOptionalNextId();

	/**
	 *	Get the required ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The required ICFBamSchemaDefObj instance referenced by the Schema key.
	 */
	ICFBamSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Get the required ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The required ICFBamSchemaDefObj instance referenced by the Schema key.
	 */
	ICFBamSchemaDefObj getRequiredContainerSchema( boolean forceRead );

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupRefSchema( boolean forceRead );

	/**
	 *	Get the optional ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The optional ICFBamSchemaRefObj instance referenced by the Prev key.
	 */
	ICFBamSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Get the optional ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The optional ICFBamSchemaRefObj instance referenced by the Prev key.
	 */
	ICFBamSchemaRefObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The optional ICFBamSchemaRefObj instance referenced by the Next key.
	 */
	ICFBamSchemaRefObj getOptionalLookupNext();

	/**
	 *	Get the optional ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The optional ICFBamSchemaRefObj instance referenced by the Next key.
	 */
	ICFBamSchemaRefObj getOptionalLookupNext( boolean forceRead );

}
