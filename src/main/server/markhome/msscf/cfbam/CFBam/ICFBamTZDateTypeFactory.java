
// Description: Java 11 Factory interface for TZDateType.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamTZDateTypeFactory interface for TZDateType
 */
public interface ICFBamTZDateTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TZDateType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TZDateType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateTypeBuff newBuff();

	/**
	 *	Allocate a TZDateType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateTypeHBuff newHBuff();

}
