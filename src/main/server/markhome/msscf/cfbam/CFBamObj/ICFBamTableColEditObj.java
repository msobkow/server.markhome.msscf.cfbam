// Description: Java 11 Instance Edit Object interface for CFBam TableCol.

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

public interface ICFBamTableColEditObj
	extends ICFBamTableColObj,
		ICFBamValueEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamTableColObj.
	 */
	ICFBamTableColObj getOrigAsTableCol();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The String value of the attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Set the optional String attribute DbName.
	 *
	 *	@param	value	the String value of the attribute DbName.
	 */
	void setOptionalDbName( String value );

	/**
	 *	Get the optional String attribute XmlElementName.
	 *
	 *	@return	The String value of the attribute XmlElementName.
	 */
	String getOptionalXmlElementName();

	/**
	 *	Set the optional String attribute XmlElementName.
	 *
	 *	@param	value	the String value of the attribute XmlElementName.
	 */
	void setOptionalXmlElementName( String value );

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
	 *	Get the ICFBamValueObj instance referenced by the DataType key.
	 *
	 *	@return	The ICFBamValueObj instance referenced by the DataType key.
	 */
	ICFBamValueObj getRequiredParentDataType();

	/**
	 *	Set the ICFBamValueObj instance referenced by the DataType key.
	 *
	 *	@param	value	the ICFBamValueObj instance to be referenced by the DataType key.
	 */
	void setRequiredParentDataType( ICFBamValueObj value );
}
