
// Description: Java 11 Factory interface for EnumDef.

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
 *	CFBamEnumDefFactory interface for EnumDef
 */
public interface ICFBamEnumDefFactory
{

	/**
	 *	Allocate a EnumDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumDefBuff newBuff();

	/**
	 *	Allocate a EnumDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumDefHBuff newHBuff();

}
