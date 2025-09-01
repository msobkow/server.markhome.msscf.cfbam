
// Description: Java 11 Default Factory implementation for PopTopDep.

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
	 *	CFBamPopTopDepFactory implementation for PopTopDep
	 */
public class CFBamPopTopDepDefaultFactory
	implements ICFBamPopTopDepFactory
{
	public CFBamPopTopDepDefaultFactory() {
	}

	public CFBamPopTopDepByContRelIdxKey newContRelIdxKey() {
		CFBamPopTopDepByContRelIdxKey key =
			new CFBamPopTopDepByContRelIdxKey();
		return( key );
	}

	public CFBamPopTopDepByUNameIdxKey newUNameIdxKey() {
		CFBamPopTopDepByUNameIdxKey key =
			new CFBamPopTopDepByUNameIdxKey();
		return( key );
	}

	public CFBamPopTopDepBuff newBuff() {
		CFBamPopTopDepBuff buff =
			new CFBamPopTopDepBuff();
		return( buff );
	}

	public CFBamPopTopDepHBuff newHBuff() {
		CFBamPopTopDepHBuff hbuff =
			new CFBamPopTopDepHBuff();
		return( hbuff );
	}
}
