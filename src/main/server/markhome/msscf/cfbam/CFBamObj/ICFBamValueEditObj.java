// Description: Java 11 Instance Edit Object interface for CFBam Value.

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

public interface ICFBamValueEditObj
	extends ICFBamValueObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFBamValueObj.
	 */
	ICFBamValueObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamValueObj.
	 */
	ICFBamValueObj getOrigAsValue();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFBamValueObj create();

	/*
	 *	Update the instance.
	 */
	CFBamValueEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFBamValueEditObj deleteInstance();

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
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The String value of the attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Set the optional String attribute ShortName.
	 *
	 *	@param	value	the String value of the attribute ShortName.
	 */
	void setOptionalShortName( String value );

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The String value of the attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Set the optional String attribute Label.
	 *
	 *	@param	value	the String value of the attribute Label.
	 */
	void setOptionalLabel( String value );

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The String value of the attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Set the optional String attribute ShortDescription.
	 *
	 *	@param	value	the String value of the attribute ShortDescription.
	 */
	void setOptionalShortDescription( String value );

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The String value of the attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Set the optional String attribute Description.
	 *
	 *	@param	value	the String value of the attribute Description.
	 */
	void setOptionalDescription( String value );

	/**
	 *	Get the optional String attribute DefaultXmlValue.
	 *
	 *	@return	The String value of the attribute DefaultXmlValue.
	 */
	String getOptionalDefaultXmlValue();

	/**
	 *	Set the optional String attribute DefaultXmlValue.
	 *
	 *	@param	value	the String value of the attribute DefaultXmlValue.
	 */
	void setOptionalDefaultXmlValue( String value );

	/**
	 *	Get the required boolean attribute IsNullable.
	 *
	 *	@return	The boolean value of the attribute IsNullable.
	 */
	boolean getRequiredIsNullable();

	/**
	 *	Set the required boolean attribute IsNullable.
	 *
	 *	@param	value	the boolean value of the attribute IsNullable.
	 */
	void setRequiredIsNullable( boolean value );

	/**
	 *	Get the optional Boolean attribute GenerateId.
	 *
	 *	@return	The Boolean value of the attribute GenerateId.
	 */
	Boolean getOptionalGenerateId();

	/**
	 *	Set the optional Boolean attribute GenerateId.
	 *
	 *	@param	value	the Boolean value of the attribute GenerateId.
	 */
	void setOptionalGenerateId( Boolean value );

	/**
	 *	Get the required boolean attribute ImplementsPolymorph.
	 *
	 *	@return	The boolean value of the attribute ImplementsPolymorph.
	 */
	boolean getRequiredImplementsPolymorph();

	/**
	 *	Set the required boolean attribute ImplementsPolymorph.
	 *
	 *	@param	value	the boolean value of the attribute ImplementsPolymorph.
	 */
	void setRequiredImplementsPolymorph( boolean value );

	/**
	 *	Get the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFSecTenantObj value );

	/**
	 *	Get the ICFBamScopeObj instance referenced by the Scope key.
	 *
	 *	@return	The ICFBamScopeObj instance referenced by the Scope key.
	 */
	ICFBamScopeObj getRequiredContainerScope();

	/**
	 *	Set the ICFBamScopeObj instance referenced by the Scope key.
	 *
	 *	@param	value	the ICFBamScopeObj instance to be referenced by the Scope key.
	 */
	void setRequiredContainerScope( ICFBamScopeObj value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the DefSchema key.
	 */
	void setOptionalLookupDefSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamValueObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamValueObj instance referenced by the Prev key.
	 */
	ICFBamValueObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamValueObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamValueObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamValueObj value );

	/**
	 *	Get the ICFBamValueObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamValueObj instance referenced by the Next key.
	 */
	ICFBamValueObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamValueObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamValueObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamValueObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
