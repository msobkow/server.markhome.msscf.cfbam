
// Description: Java 11 Factory interface for EnumType.

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
 *	CFBamEnumTypeFactory interface for EnumType
 */
public interface ICFBamEnumTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over EnumType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a EnumType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTypeBuff newBuff();

	/**
	 *	Allocate a EnumType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTypeHBuff newHBuff();

}
