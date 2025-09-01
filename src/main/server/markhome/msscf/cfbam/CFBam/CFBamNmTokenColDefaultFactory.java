
// Description: Java 11 Default Factory implementation for NmTokenCol.

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
	 *	CFBamNmTokenColFactory implementation for NmTokenCol
	 */
public class CFBamNmTokenColDefaultFactory
	implements ICFBamNmTokenColFactory
{
	public CFBamNmTokenColDefaultFactory() {
	}

	public CFBamNmTokenColByTableIdxKey newTableIdxKey() {
		CFBamNmTokenColByTableIdxKey key =
			new CFBamNmTokenColByTableIdxKey();
		return( key );
	}

	public CFBamNmTokenColBuff newBuff() {
		CFBamNmTokenColBuff buff =
			new CFBamNmTokenColBuff();
		return( buff );
	}

	public CFBamNmTokenColHBuff newHBuff() {
		CFBamNmTokenColHBuff hbuff =
			new CFBamNmTokenColHBuff();
		return( hbuff );
	}
}
