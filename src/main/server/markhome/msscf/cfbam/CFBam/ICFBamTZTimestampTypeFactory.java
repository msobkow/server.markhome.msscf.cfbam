
// Description: Java 11 Factory interface for TZTimestampType.

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
 *	CFBamTZTimestampTypeFactory interface for TZTimestampType
 */
public interface ICFBamTZTimestampTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TZTimestampType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TZTimestampType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampTypeBuff newBuff();

	/**
	 *	Allocate a TZTimestampType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampTypeHBuff newHBuff();

}
