
// Description: Java 11 Default Factory implementation for TimestampCol.

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
	 *	CFBamTimestampColFactory implementation for TimestampCol
	 */
public class CFBamTimestampColDefaultFactory
	implements ICFBamTimestampColFactory
{
	public CFBamTimestampColDefaultFactory() {
	}

	public CFBamTimestampColByTableIdxKey newTableIdxKey() {
		CFBamTimestampColByTableIdxKey key =
			new CFBamTimestampColByTableIdxKey();
		return( key );
	}

	public CFBamTimestampColBuff newBuff() {
		CFBamTimestampColBuff buff =
			new CFBamTimestampColBuff();
		return( buff );
	}

	public CFBamTimestampColHBuff newHBuff() {
		CFBamTimestampColHBuff hbuff =
			new CFBamTimestampColHBuff();
		return( hbuff );
	}
}
