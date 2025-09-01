
// Description: Java 11 Default Factory implementation for TimeCol.

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
	 *	CFBamTimeColFactory implementation for TimeCol
	 */
public class CFBamTimeColDefaultFactory
	implements ICFBamTimeColFactory
{
	public CFBamTimeColDefaultFactory() {
	}

	public CFBamTimeColByTableIdxKey newTableIdxKey() {
		CFBamTimeColByTableIdxKey key =
			new CFBamTimeColByTableIdxKey();
		return( key );
	}

	public CFBamTimeColBuff newBuff() {
		CFBamTimeColBuff buff =
			new CFBamTimeColBuff();
		return( buff );
	}

	public CFBamTimeColHBuff newHBuff() {
		CFBamTimeColHBuff hbuff =
			new CFBamTimeColHBuff();
		return( hbuff );
	}
}
