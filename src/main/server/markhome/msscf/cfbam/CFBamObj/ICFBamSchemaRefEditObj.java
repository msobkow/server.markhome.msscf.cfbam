// Description: Java 11 Instance Edit Object interface for CFBam SchemaRef.

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
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamSchemaRefEditObj
	extends ICFBamSchemaRefObj,
		ICFBamScopeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamSchemaRefObj.
	 */
	ICFBamSchemaRefObj getOrigAsSchemaRef();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the required String attribute RefModelName.
	 *
	 *	@return	The String value of the attribute RefModelName.
	 */
	String getRequiredRefModelName();

	/**
	 *	Set the required String attribute RefModelName.
	 *
	 *	@param	value	the String value of the attribute RefModelName.
	 */
	void setRequiredRefModelName( String value );

	/**
	 *	Get the required String attribute IncludeRoot.
	 *
	 *	@return	The String value of the attribute IncludeRoot.
	 */
	String getRequiredIncludeRoot();

	/**
	 *	Set the required String attribute IncludeRoot.
	 *
	 *	@param	value	the String value of the attribute IncludeRoot.
	 */
	void setRequiredIncludeRoot( String value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the Schema key.
	 */
	ICFBamSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the Schema key.
	 */
	void setRequiredContainerSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the RefSchema key.
	 */
	void setOptionalLookupRefSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamSchemaRefObj instance referenced by the Prev key.
	 */
	ICFBamSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamSchemaRefObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamSchemaRefObj value );

	/**
	 *	Get the ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamSchemaRefObj instance referenced by the Next key.
	 */
	ICFBamSchemaRefObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamSchemaRefObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamSchemaRefObj value );
}
