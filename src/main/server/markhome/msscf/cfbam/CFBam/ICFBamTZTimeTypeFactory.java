
// Description: Java 11 Factory interface for TZTimeType.

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
 *	CFBamTZTimeTypeFactory interface for TZTimeType
 */
public interface ICFBamTZTimeTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TZTimeType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimeTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TZTimeType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimeTypeBuff newBuff();

	/**
	 *	Allocate a TZTimeType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimeTypeHBuff newHBuff();

}
