// Description: Java 11 Object interface for CFBam ServerMethod.

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

public interface ICFBamServerMethodObj
	extends ICFBamScopeObj
{
	/**
	 *	Get the current edition of this ServerMethod instance as a ICFBamServerMethodEditObj.
	 *
	 *	@return	The ICFBamServerMethodEditObj edition of this instance.
	 */
	ICFBamServerMethodEditObj getEditAsServerMethod();

	/**
	 *	Get the ICFBamServerMethodTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamServerMethodTableObj table cache which manages this instance.
	 */
	ICFBamServerMethodTableObj getServerMethodTable();

	/**
	 *	Get the CFBamServerMethodBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamServerMethodBuff instance which currently backs this object.
	 */
	CFBamServerMethodBuff getServerMethodBuff();

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
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Get the required boolean attribute IsInstanceMethod.
	 *
	 *	@return	The required boolean attribute IsInstanceMethod.
	 */
	boolean getRequiredIsInstanceMethod();

	/**
	 *	Get the required boolean attribute IsServerOnly.
	 *
	 *	@return	The required boolean attribute IsServerOnly.
	 */
	boolean getRequiredIsServerOnly();

	/**
	 *	Get the required String attribute JMethodBody.
	 *
	 *	@return	The required String attribute JMethodBody.
	 */
	String getRequiredJMethodBody();

	/**
	 *	Get the required String attribute CppMethodBody.
	 *
	 *	@return	The required String attribute CppMethodBody.
	 */
	String getRequiredCppMethodBody();

	/**
	 *	Get the required String attribute CsMethodBody.
	 *
	 *	@return	The required String attribute CsMethodBody.
	 */
	String getRequiredCsMethodBody();

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
	 *	Get the required ICFBamTableObj instance referenced by the ForTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ForTable key.
	 */
	ICFBamTableObj getRequiredContainerForTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the ForTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ForTable key.
	 */
	ICFBamTableObj getRequiredContainerForTable( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamParamObj array of instances referenced by the Params key.
	 *
	 *	@return	The optional ICFBamParamObj[] array of instances referenced by the Params key.
	 */
	List<ICFBamParamObj> getOptionalComponentsParams();

	/**
	 *	Get the array of optional ICFBamParamObj array of instances referenced by the Params key.
	 *
	 *	@return	The optional ICFBamParamObj[] array of instances referenced by the Params key.
	 */
	List<ICFBamParamObj> getOptionalComponentsParams( boolean forceRead );

}
