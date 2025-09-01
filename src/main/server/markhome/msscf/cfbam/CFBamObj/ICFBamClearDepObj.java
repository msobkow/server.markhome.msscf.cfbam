// Description: Java 11 Object interface for CFBam ClearDep.

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

public interface ICFBamClearDepObj
	extends ICFBamScopeObj
{
	/**
	 *	Get the current edition of this ClearDep instance as a ICFBamClearDepEditObj.
	 *
	 *	@return	The ICFBamClearDepEditObj edition of this instance.
	 */
	ICFBamClearDepEditObj getEditAsClearDep();

	/**
	 *	Get the ICFBamClearDepTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearDepTableObj table cache which manages this instance.
	 */
	ICFBamClearDepTableObj getClearDepTable();

	/**
	 *	Get the CFBamClearDepBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearDepBuff instance which currently backs this object.
	 */
	CFBamClearDepBuff getClearDepBuff();

	/**
	 *	Get the required long attribute RelationId.
	 *
	 *	@return	The required long attribute RelationId.
	 */
	long getRequiredRelationId();

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
	 *	Get the required ICFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the Relation key.
	 */
	ICFBamRelationObj getRequiredLookupRelation();

	/**
	 *	Get the required ICFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the Relation key.
	 */
	ICFBamRelationObj getRequiredLookupRelation( boolean forceRead );

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

}
