
// Description: Java 11 Default Factory implementation for FloatDef.

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
	 *	CFBamFloatDefFactory implementation for FloatDef
	 */
public class CFBamFloatDefDefaultFactory
	implements ICFBamFloatDefFactory
{
	public CFBamFloatDefDefaultFactory() {
	}

	public CFBamFloatDefBuff newBuff() {
		CFBamFloatDefBuff buff =
			new CFBamFloatDefBuff();
		return( buff );
	}

	public CFBamFloatDefHBuff newHBuff() {
		CFBamFloatDefHBuff hbuff =
			new CFBamFloatDefHBuff();
		return( hbuff );
	}
}
