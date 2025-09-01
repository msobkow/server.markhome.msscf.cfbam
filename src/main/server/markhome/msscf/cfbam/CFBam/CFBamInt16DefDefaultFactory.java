
// Description: Java 11 Default Factory implementation for Int16Def.

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
	 *	CFBamInt16DefFactory implementation for Int16Def
	 */
public class CFBamInt16DefDefaultFactory
	implements ICFBamInt16DefFactory
{
	public CFBamInt16DefDefaultFactory() {
	}

	public CFBamInt16DefBuff newBuff() {
		CFBamInt16DefBuff buff =
			new CFBamInt16DefBuff();
		return( buff );
	}

	public CFBamInt16DefHBuff newHBuff() {
		CFBamInt16DefHBuff hbuff =
			new CFBamInt16DefHBuff();
		return( hbuff );
	}
}
