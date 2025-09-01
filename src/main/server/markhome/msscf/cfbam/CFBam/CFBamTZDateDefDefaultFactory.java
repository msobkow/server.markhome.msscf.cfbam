
// Description: Java 11 Default Factory implementation for TZDateDef.

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
	 *	CFBamTZDateDefFactory implementation for TZDateDef
	 */
public class CFBamTZDateDefDefaultFactory
	implements ICFBamTZDateDefFactory
{
	public CFBamTZDateDefDefaultFactory() {
	}

	public CFBamTZDateDefBuff newBuff() {
		CFBamTZDateDefBuff buff =
			new CFBamTZDateDefBuff();
		return( buff );
	}

	public CFBamTZDateDefHBuff newHBuff() {
		CFBamTZDateDefHBuff hbuff =
			new CFBamTZDateDefHBuff();
		return( hbuff );
	}
}
