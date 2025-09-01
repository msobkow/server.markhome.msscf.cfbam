// Description: Java 11 Instance Edit Object interface for CFBam ClearTopDep.

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

public interface ICFBamClearTopDepEditObj
	extends ICFBamClearTopDepObj,
		ICFBamClearDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamClearTopDepObj.
	 */
	ICFBamClearTopDepObj getOrigAsClearTopDep();

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
	 *	Get the ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable();

	/**
	 *	Set the ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@param	value	the ICFBamTableObj instance to be referenced by the Table key.
	 */
	void setRequiredContainerTable( ICFBamTableObj value );

	/**
	 *	Get the ICFBamClearTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamClearTopDepObj instance referenced by the Prev key.
	 */
	ICFBamClearTopDepObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamClearTopDepObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamClearTopDepObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamClearTopDepObj value );

	/**
	 *	Get the ICFBamClearTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamClearTopDepObj instance referenced by the Next key.
	 */
	ICFBamClearTopDepObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamClearTopDepObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamClearTopDepObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamClearTopDepObj value );
}
