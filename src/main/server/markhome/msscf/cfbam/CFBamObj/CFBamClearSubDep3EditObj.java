// Description: Java 11 edit object instance implementation for CFBam ClearSubDep3.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamClearSubDep3EditObj
	extends CFBamClearDepEditObj

	implements ICFBamClearSubDep3EditObj
{
	protected ICFBamClearSubDep2Obj requiredContainerClearSubDep2;

	public CFBamClearSubDep3EditObj( ICFBamClearSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerClearSubDep2 = null;
	}

	public String getClassCode() {
		return( CFBamClearSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep3" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamClearSubDep2Obj scope = getRequiredContainerClearSubDep2();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamClearSubDep2Obj scope = getRequiredContainerClearSubDep2();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamClearSubDep3Obj retobj = getSchema().getClearSubDep3TableObj().realiseClearSubDep3( (ICFBamClearSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearSubDep3().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamClearSubDep3Obj retobj = ((ICFBamSchemaObj)getOrigAsClearSubDep3().getSchema()).getClearSubDep3TableObj().createClearSubDep3( getOrigAsClearSubDep3() );
		if( retobj == getOrigAsClearSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getClearSubDep3TableObj().updateClearSubDep3( (ICFBamClearSubDep3Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearSubDep3TableObj().deleteClearSubDep3( getOrigAsClearSubDep3() );
		return( null );
	}

	public ICFBamClearSubDep3TableObj getClearSubDep3Table() {
		return( orig.getSchema().getClearSubDep3TableObj() );
	}

	public ICFBamClearSubDep3EditObj getEditAsClearSubDep3() {
		return( (ICFBamClearSubDep3EditObj)this );
	}

	public ICFBamClearSubDep3Obj getOrigAsClearSubDep3() {
		return( (ICFBamClearSubDep3Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsClearSubDep3().getSchema().getBackingStore()).getFactoryClearSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerClearSubDep2 = null;
		}
	}

	public CFBamClearSubDep3Buff getClearSubDep3Buff() {
		return( (CFBamClearSubDep3Buff)getBuff() );
	}

	public long getRequiredClearSubDep2TenantId() {
		return( getClearSubDep3Buff().getRequiredClearSubDep2TenantId() );
	}

	public long getRequiredClearSubDep2Id() {
		return( getClearSubDep3Buff().getRequiredClearSubDep2Id() );
	}

	public String getRequiredName() {
		return( getClearSubDep3Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getClearSubDep3Buff().getRequiredName() != value ) {
			getClearSubDep3Buff().setRequiredName( value );
		}
	}

	public ICFBamClearSubDep2Obj getRequiredContainerClearSubDep2() {
		return( getRequiredContainerClearSubDep2( false ) );
	}

	public ICFBamClearSubDep2Obj getRequiredContainerClearSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerClearSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamClearSubDep2Obj obj = ((ICFBamSchemaObj)getOrigAsClearSubDep3().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByIdIdx( getClearSubDep3Buff().getRequiredClearSubDep2TenantId(),
					getClearSubDep3Buff().getRequiredClearSubDep2Id() );
				requiredContainerClearSubDep2 = obj;
				if( obj != null ) {
					getClearSubDep3Buff().setRequiredClearSubDep2TenantId( obj.getRequiredTenantId() );
					getClearSubDep3Buff().setRequiredClearSubDep2Id( obj.getRequiredId() );
					requiredContainerClearSubDep2 = obj;
				}
			}
		}
		return( requiredContainerClearSubDep2 );
	}

	public void setRequiredContainerClearSubDep2( ICFBamClearSubDep2Obj value ) {
			if( buff == null ) {
				getClearSubDep3Buff();
			}
			if( value != null ) {
				getClearSubDep3Buff().setRequiredClearSubDep2TenantId( value.getRequiredTenantId() );
				getClearSubDep3Buff().setRequiredClearSubDep2Id( value.getRequiredId() );
			}
			requiredContainerClearSubDep2 = value;
	}

	public void copyBuffToOrig() {
		CFBamClearSubDep3Buff origBuff = getOrigAsClearSubDep3().getClearSubDep3Buff();
		CFBamClearSubDep3Buff myBuff = getClearSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamClearSubDep3Buff origBuff = getOrigAsClearSubDep3().getClearSubDep3Buff();
		CFBamClearSubDep3Buff myBuff = getClearSubDep3Buff();
		myBuff.set( origBuff );
	}
}
