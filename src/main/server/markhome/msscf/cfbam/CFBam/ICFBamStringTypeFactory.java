
// Description: Java 11 Factory interface for StringType.

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
 *	CFBamStringTypeFactory interface for StringType
 */
public interface ICFBamStringTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over StringType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a StringType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringTypeBuff newBuff();

	/**
	 *	Allocate a StringType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamStringTypeHBuff newHBuff();

}
