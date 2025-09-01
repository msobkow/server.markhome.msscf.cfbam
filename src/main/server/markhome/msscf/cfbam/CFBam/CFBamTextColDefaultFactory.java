
// Description: Java 11 Default Factory implementation for TextCol.

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
	 *	CFBamTextColFactory implementation for TextCol
	 */
public class CFBamTextColDefaultFactory
	implements ICFBamTextColFactory
{
	public CFBamTextColDefaultFactory() {
	}

	public CFBamTextColByTableIdxKey newTableIdxKey() {
		CFBamTextColByTableIdxKey key =
			new CFBamTextColByTableIdxKey();
		return( key );
	}

	public CFBamTextColBuff newBuff() {
		CFBamTextColBuff buff =
			new CFBamTextColBuff();
		return( buff );
	}

	public CFBamTextColHBuff newHBuff() {
		CFBamTextColHBuff hbuff =
			new CFBamTextColHBuff();
		return( hbuff );
	}
}
