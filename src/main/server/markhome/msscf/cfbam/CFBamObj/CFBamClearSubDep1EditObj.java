// Description: Java 11 edit object instance implementation for CFBam ClearSubDep1.

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

public class CFBamClearSubDep1EditObj
	extends CFBamClearDepEditObj

	implements ICFBamClearSubDep1EditObj
{
	protected ICFBamClearTopDepObj requiredContainerClearTopDep;

	public CFBamClearSubDep1EditObj( ICFBamClearSubDep1Obj argOrig ) {
		super( argOrig );
		requiredContainerClearTopDep = null;
	}

	public String getClassCode() {
		return( CFBamClearSubDep1Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep1" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
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
		ICFBamClearSubDep1Obj retobj = getSchema().getClearSubDep1TableObj().realiseClearSubDep1( (ICFBamClearSubDep1Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearSubDep1().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamClearSubDep1Obj retobj = ((ICFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep1TableObj().createClearSubDep1( getOrigAsClearSubDep1() );
		if( retobj == getOrigAsClearSubDep1() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getClearSubDep1TableObj().updateClearSubDep1( (ICFBamClearSubDep1Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearSubDep1TableObj().deleteClearSubDep1( getOrigAsClearSubDep1() );
		return( null );
	}

	public ICFBamClearSubDep1TableObj getClearSubDep1Table() {
		return( orig.getSchema().getClearSubDep1TableObj() );
	}

	public ICFBamClearSubDep1EditObj getEditAsClearSubDep1() {
		return( (ICFBamClearSubDep1EditObj)this );
	}

	public ICFBamClearSubDep1Obj getOrigAsClearSubDep1() {
		return( (ICFBamClearSubDep1Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsClearSubDep1().getSchema().getBackingStore()).getFactoryClearSubDep1().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerClearTopDep = null;
		}
	}

	public CFBamClearSubDep1Buff getClearSubDep1Buff() {
		return( (CFBamClearSubDep1Buff)getBuff() );
	}

	public long getRequiredClearTopDepTenantId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepTenantId() );
	}

	public long getRequiredClearTopDepId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepId() );
	}

	public String getRequiredName() {
		return( getClearSubDep1Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getClearSubDep1Buff().getRequiredName() != value ) {
			getClearSubDep1Buff().setRequiredName( value );
		}
	}

	public ICFBamClearTopDepObj getRequiredContainerClearTopDep() {
		return( getRequiredContainerClearTopDep( false ) );
	}

	public ICFBamClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead ) {
		if( forceRead || ( requiredContainerClearTopDep == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamClearTopDepObj obj = ((ICFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearSubDep1Buff().getRequiredClearTopDepTenantId(),
					getClearSubDep1Buff().getRequiredClearTopDepId() );
				requiredContainerClearTopDep = obj;
				if( obj != null ) {
					getClearSubDep1Buff().setRequiredClearTopDepTenantId( obj.getRequiredTenantId() );
					getClearSubDep1Buff().setRequiredClearTopDepId( obj.getRequiredId() );
					requiredContainerClearTopDep = obj;
				}
			}
		}
		return( requiredContainerClearTopDep );
	}

	public void setRequiredContainerClearTopDep( ICFBamClearTopDepObj value ) {
			if( buff == null ) {
				getClearSubDep1Buff();
			}
			if( value != null ) {
				getClearSubDep1Buff().setRequiredClearTopDepTenantId( value.getRequiredTenantId() );
				getClearSubDep1Buff().setRequiredClearTopDepId( value.getRequiredId() );
			}
			requiredContainerClearTopDep = value;
	}

	public List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep() {
		List<ICFBamClearSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<ICFBamClearSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFBamClearSubDep1Buff origBuff = getOrigAsClearSubDep1().getClearSubDep1Buff();
		CFBamClearSubDep1Buff myBuff = getClearSubDep1Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamClearSubDep1Buff origBuff = getOrigAsClearSubDep1().getClearSubDep1Buff();
		CFBamClearSubDep1Buff myBuff = getClearSubDep1Buff();
		myBuff.set( origBuff );
	}
}
