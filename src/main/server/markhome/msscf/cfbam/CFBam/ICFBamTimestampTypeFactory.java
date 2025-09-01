
// Description: Java 11 Factory interface for TimestampType.

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
 *	CFBamTimestampTypeFactory interface for TimestampType
 */
public interface ICFBamTimestampTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TimestampType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TimestampType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampTypeBuff newBuff();

	/**
	 *	Allocate a TimestampType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimestampTypeHBuff newHBuff();

}
