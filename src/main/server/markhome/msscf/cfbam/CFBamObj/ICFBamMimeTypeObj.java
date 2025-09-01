// Description: Java 11 Object interface for CFBam MimeType.

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

public interface ICFBamMimeTypeObj
	extends ICFIntMimeTypeObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a MimeType.
	 *
	 *	@return	CFIntMimeTypeObj instance which should be subsequently referenced.
	 */
	ICFIntMimeTypeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntMimeTypeObj the reference to the cached or read (realised) instance.
	 */
	ICFIntMimeTypeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntMimeTypeObj the reference to the cached or read (realised) instance.
	 */
	ICFIntMimeTypeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this MimeType instance.
	 *
	 *	@return	The newly locked ICFIntMimeTypeEditObj edition of this instance.
	 */
	ICFIntMimeTypeEditObj beginEdit();

	/**
	 *	End this edition of this MimeType instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this MimeType instance.
	 *
	 *	@return	The ICFIntMimeTypeEditObj edition of this instance.
	 */
	ICFIntMimeTypeEditObj getEdit();

	/**
	 *	Get the current edition of this MimeType instance as a ICFIntMimeTypeEditObj.
	 *
	 *	@return	The ICFIntMimeTypeEditObj edition of this instance.
	 */
	ICFIntMimeTypeEditObj getEditAsMimeType();

	/**
	 *	Get the ICFIntMimeTypeTableObj table cache which manages this instance.
	 *
	 *	@return	ICFIntMimeTypeTableObj table cache which manages this instance.
	 */
	ICFIntMimeTypeTableObj getMimeTypeTable();

	/**
	 *	Get the ICFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFIntSchemaObj schema cache which manages this instance.
	 */
	ICFIntSchemaObj getSchema();

	/**
	 *	Get the CFIntMimeTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFIntMimeTypeBuff instance which currently backs this object.
	 */
	CFIntMimeTypeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFIntMimeTypeBuff value );

	/**
	 *	Get the CFIntMimeTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFIntMimeTypeBuff instance which currently backs this object.
	 */
	CFIntMimeTypeBuff getMimeTypeBuff();

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required int attribute MimeTypeId.
	 *
	 *	@return	The required int attribute MimeTypeId.
	 */
	int getRequiredMimeTypeId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute FileTypes.
	 *
	 *	@return	The optional String attribute FileTypes.
	 */
	String getOptionalFileTypes();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
