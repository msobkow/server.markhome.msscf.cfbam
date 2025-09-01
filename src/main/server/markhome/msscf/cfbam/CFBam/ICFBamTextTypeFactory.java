
// Description: Java 11 Factory interface for TextType.

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
 *	CFBamTextTypeFactory interface for TextType
 */
public interface ICFBamTextTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TextType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a TextType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextTypeBuff newBuff();

	/**
	 *	Allocate a TextType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTextTypeHBuff newHBuff();

}
