// Description: Java 11 Instance Edit Object interface for CFBam RelationCol.

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

public interface ICFBamRelationColEditObj
	extends ICFBamRelationColObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFBamRelationColObj.
	 */
	ICFBamRelationColObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamRelationColObj.
	 */
	ICFBamRelationColObj getOrigAsRelationCol();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFBamRelationColObj create();

	/*
	 *	Update the instance.
	 */
	CFBamRelationColEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFBamRelationColEditObj deleteInstance();

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
	 *	Get the ICFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@return	The ICFBamRelationObj instance referenced by the Relation key.
	 */
	ICFBamRelationObj getRequiredContainerRelation();

	/**
	 *	Set the ICFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@param	value	the ICFBamRelationObj instance to be referenced by the Relation key.
	 */
	void setRequiredContainerRelation( ICFBamRelationObj value );

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
	 *	Get the ICFBamRelationColObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamRelationColObj instance referenced by the Prev key.
	 */
	ICFBamRelationColObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamRelationColObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamRelationColObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamRelationColObj value );

	/**
	 *	Get the ICFBamRelationColObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamRelationColObj instance referenced by the Next key.
	 */
	ICFBamRelationColObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamRelationColObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamRelationColObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamRelationColObj value );

	/**
	 *	Get the ICFBamIndexColObj instance referenced by the FromCol key.
	 *
	 *	@return	The ICFBamIndexColObj instance referenced by the FromCol key.
	 */
	ICFBamIndexColObj getRequiredLookupFromCol();

	/**
	 *	Set the ICFBamIndexColObj instance referenced by the FromCol key.
	 *
	 *	@param	value	the ICFBamIndexColObj instance to be referenced by the FromCol key.
	 */
	void setRequiredLookupFromCol( ICFBamIndexColObj value );

	/**
	 *	Get the ICFBamIndexColObj instance referenced by the ToCol key.
	 *
	 *	@return	The ICFBamIndexColObj instance referenced by the ToCol key.
	 */
	ICFBamIndexColObj getRequiredLookupToCol();

	/**
	 *	Set the ICFBamIndexColObj instance referenced by the ToCol key.
	 *
	 *	@param	value	the ICFBamIndexColObj instance to be referenced by the ToCol key.
	 */
	void setRequiredLookupToCol( ICFBamIndexColObj value );

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
