
// Description: Java 11 Default Factory implementation for ClearTopDep.

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
	 *	CFBamClearTopDepFactory implementation for ClearTopDep
	 */
public class CFBamClearTopDepDefaultFactory
	implements ICFBamClearTopDepFactory
{
	public CFBamClearTopDepDefaultFactory() {
	}

	public CFBamClearTopDepByClrTopDepTblIdxKey newClrTopDepTblIdxKey() {
		CFBamClearTopDepByClrTopDepTblIdxKey key =
			new CFBamClearTopDepByClrTopDepTblIdxKey();
		return( key );
	}

	public CFBamClearTopDepByUNameIdxKey newUNameIdxKey() {
		CFBamClearTopDepByUNameIdxKey key =
			new CFBamClearTopDepByUNameIdxKey();
		return( key );
	}

	public CFBamClearTopDepByPrevIdxKey newPrevIdxKey() {
		CFBamClearTopDepByPrevIdxKey key =
			new CFBamClearTopDepByPrevIdxKey();
		return( key );
	}

	public CFBamClearTopDepByNextIdxKey newNextIdxKey() {
		CFBamClearTopDepByNextIdxKey key =
			new CFBamClearTopDepByNextIdxKey();
		return( key );
	}

	public CFBamClearTopDepBuff newBuff() {
		CFBamClearTopDepBuff buff =
			new CFBamClearTopDepBuff();
		return( buff );
	}

	public CFBamClearTopDepHBuff newHBuff() {
		CFBamClearTopDepHBuff hbuff =
			new CFBamClearTopDepHBuff();
		return( hbuff );
	}
}
