// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamTopProjectTableObj
	implements ICFBamTopProjectTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFIntTopProjectPKey, ICFIntTopProjectObj> members;
	private Map<CFIntTopProjectPKey, ICFIntTopProjectObj> allTopProject;
	private Map< CFIntTopProjectByTenantIdxKey,
		Map<CFIntTopProjectPKey, ICFIntTopProjectObj > > indexByTenantIdx;
	private Map< CFIntTopProjectByTopDomainIdxKey,
		Map<CFIntTopProjectPKey, ICFIntTopProjectObj > > indexByTopDomainIdx;
	private Map< CFIntTopProjectByNameIdxKey,
		ICFIntTopProjectObj > indexByNameIdx;
	public static String TABLE_NAME = "TopProject";
	public static String TABLE_DBNAME = "tprjdef";

	public CFBamTopProjectTableObj() {
		schema = null;
		members = new HashMap<CFIntTopProjectPKey, ICFIntTopProjectObj>();
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
		indexByNameIdx = null;
	}

	public CFBamTopProjectTableObj( ICFIntSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFIntTopProjectPKey, ICFIntTopProjectObj>();
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
		indexByNameIdx = null;
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamTenantObj.class );
	}


	public void minimizeMemory() {
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
		indexByNameIdx = null;
		List<ICFIntTopProjectObj> toForget = new LinkedList<ICFIntTopProjectObj>();
		ICFIntTopProjectObj cur = null;
		Iterator<ICFIntTopProjectObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamTopProjectObj.
	 */
	public ICFIntTopProjectObj newInstance() {
		ICFIntTopProjectObj inst = new CFBamTopProjectObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamTopProjectObj.
	 */
	public ICFIntTopProjectEditObj newEditInstance( ICFIntTopProjectObj orig ) {
		ICFIntTopProjectEditObj edit = new CFBamTopProjectEditObj( orig );
		return( edit );
	}

	public ICFIntTopProjectObj realiseTopProject( ICFIntTopProjectObj Obj ) {
		ICFIntTopProjectObj obj = Obj;
		CFIntTopProjectPKey pkey = obj.getPKey();
		ICFIntTopProjectObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFIntTopProjectObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFIntTopProjectByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTopDomainIdx != null ) {
				CFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.remove( keepObj.getPKey() );
					if( mapTopDomainIdx.size() <= 0 ) {
						indexByTopDomainIdx.remove( keyTopDomainIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				CFIntTopProjectByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFIntTopProjectByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopDomainIdx != null ) {
				CFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFIntTopProjectByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allTopProject != null ) {
				allTopProject.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTopProject != null ) {
				allTopProject.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFIntTopProjectByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopDomainIdx != null ) {
				CFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<CFIntTopProjectPKey, ICFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFIntTopProjectByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFIntTopProjectObj createTopProject( ICFIntTopProjectObj Obj ) {
		ICFIntTopProjectObj obj = Obj;
		CFIntTopProjectBuff buff = obj.getTopProjectBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableTopProject().createTopProject(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFIntTopProjectObj readTopProject( CFIntTopProjectPKey pkey ) {
		return( readTopProject( pkey, false ) );
	}

	public ICFIntTopProjectObj readTopProject( CFIntTopProjectPKey pkey, boolean forceRead ) {
		ICFIntTopProjectObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFIntTopProjectBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFIntTopProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFIntTopProjectObj readCachedTopProject( CFIntTopProjectPKey pkey ) {
		ICFIntTopProjectObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTopProject( ICFIntTopProjectObj obj )
	{
		final String S_ProcName = "CFBamTopProjectTableObj.reallyDeepDisposeTopProject() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFIntTopProjectPKey pkey = obj.getPKey();
		ICFIntTopProjectObj existing = readCachedTopProject( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFIntTopProjectByTenantIdxKey keyTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFIntTopProjectByTopDomainIdxKey keyTopDomainIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		keyTopDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTopDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		CFIntTopProjectByNameIdxKey keyNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSubProjectTableObj().deepDisposeSubProjectByTopProjectIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTopDomainIdx != null ) {
			if( indexByTopDomainIdx.containsKey( keyTopDomainIdx ) ) {
				indexByTopDomainIdx.get( keyTopDomainIdx ).remove( pkey );
				if( indexByTopDomainIdx.get( keyTopDomainIdx ).size() <= 0 ) {
					indexByTopDomainIdx.remove( keyTopDomainIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeTopProject( CFIntTopProjectPKey pkey ) {
		ICFIntTopProjectObj obj = readCachedTopProject( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFIntTopProjectObj lockTopProject( CFIntTopProjectPKey pkey ) {
		ICFIntTopProjectObj locked = null;
		CFIntTopProjectBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTopProjectTableObj().newInstance();
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFIntTopProjectObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockTopProject", pkey );
		}
		return( locked );
	}

	public List<ICFIntTopProjectObj> readAllTopProject() {
		return( readAllTopProject( false ) );
	}

	public List<ICFIntTopProjectObj> readAllTopProject( boolean forceRead ) {
		final String S_ProcName = "readAllTopProject";
		if( ( allTopProject == null ) || forceRead ) {
			Map<CFIntTopProjectPKey, ICFIntTopProjectObj> map = new HashMap<CFIntTopProjectPKey,ICFIntTopProjectObj>();
			allTopProject = map;
			CFIntTopProjectBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().readAllDerived( schema.getAuthorization() );
			CFIntTopProjectBuff buff;
			ICFIntTopProjectObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				ICFIntTopProjectObj realised = (ICFIntTopProjectObj)obj.realise();
			}
		}
		int len = allTopProject.size();
		ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
		Iterator<ICFIntTopProjectObj> valIter = allTopProject.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFIntTopProjectObj> readCachedAllTopProject() {
		final String S_ProcName = "readCachedAllTopProject";
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>();
		if( allTopProject != null ) {
			int len = allTopProject.size();
			ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
			Iterator<ICFIntTopProjectObj> valIter = allTopProject.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id )
	{
		return( readTopProjectByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFIntTopProjectPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFIntTopProjectObj obj = readTopProject( pkey, forceRead );
		return( obj );
	}

	public List<ICFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId )
	{
		return( readTopProjectByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopProjectByTenantIdx";
		CFIntTopProjectByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFIntTopProjectByTenantIdxKey,
				Map< CFIntTopProjectPKey, ICFIntTopProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFIntTopProjectPKey, ICFIntTopProjectObj>();
			ICFIntTopProjectObj obj;
			CFIntTopProjectBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFIntTopProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				ICFIntTopProjectObj realised = (ICFIntTopProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
		Iterator<ICFIntTopProjectObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		return( readTopProjectByTopDomainIdx( TenantId,
			TopDomainId,
			false ) );
	}

	public List<ICFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopProjectByTopDomainIdx";
		CFIntTopProjectByTopDomainIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict;
		if( indexByTopDomainIdx == null ) {
			indexByTopDomainIdx = new HashMap< CFIntTopProjectByTopDomainIdxKey,
				Map< CFIntTopProjectPKey, ICFIntTopProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTopDomainIdx.containsKey( key ) ) {
			dict = indexByTopDomainIdx.get( key );
		}
		else {
			dict = new HashMap<CFIntTopProjectPKey, ICFIntTopProjectObj>();
			ICFIntTopProjectObj obj;
			CFIntTopProjectBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().readDerivedByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			CFIntTopProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				ICFIntTopProjectObj realised = (ICFIntTopProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTopDomainIdx.put( key, dict );
		}
		int len = dict.size();
		ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
		Iterator<ICFIntTopProjectObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFIntTopProjectObj readTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		return( readTopProjectByNameIdx( TenantId,
			TopDomainId,
			Name,
			false ) );
	}

	public ICFIntTopProjectObj readTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFIntTopProjectByNameIdxKey,
				ICFIntTopProjectObj >();
		}
		CFIntTopProjectByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		ICFIntTopProjectObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFIntTopProjectBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTopProject().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			if( buff != null ) {
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				obj = (ICFIntTopProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFIntTopProjectObj readCachedTopProjectByIdIdx( long TenantId,
		long Id )
	{
		ICFIntTopProjectObj obj = null;
		CFIntTopProjectPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTopProject( pkey );
		return( obj );
	}

	public List<ICFIntTopProjectObj> readCachedTopProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTopProjectByTenantIdx";
		CFIntTopProjectByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>();
		if( indexByTenantIdx != null ) {
			Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
				Iterator<ICFIntTopProjectObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFIntTopProjectObj obj;
			Iterator<ICFIntTopProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFIntTopProjectObj> readCachedTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "readCachedTopProjectByTopDomainIdx";
		CFIntTopProjectByTopDomainIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		ArrayList<ICFIntTopProjectObj> arrayList = new ArrayList<ICFIntTopProjectObj>();
		if( indexByTopDomainIdx != null ) {
			Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict;
			if( indexByTopDomainIdx.containsKey( key ) ) {
				dict = indexByTopDomainIdx.get( key );
				int len = dict.size();
				ICFIntTopProjectObj arr[] = new ICFIntTopProjectObj[len];
				Iterator<ICFIntTopProjectObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFIntTopProjectObj obj;
			Iterator<ICFIntTopProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFIntTopProjectObj> cmp = new Comparator<ICFIntTopProjectObj>() {
			public int compare( ICFIntTopProjectObj lhs, ICFIntTopProjectObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntTopProjectPKey lhsPKey = lhs.getPKey();
					CFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFIntTopProjectObj readCachedTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		ICFIntTopProjectObj obj = null;
		CFIntTopProjectByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFIntTopProjectObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFIntTopProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposeTopProjectByIdIdx( long TenantId,
		long Id )
	{
		ICFIntTopProjectObj obj = readCachedTopProjectByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTopProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTopProjectByTenantIdx";
		ICFIntTopProjectObj obj;
		List<ICFIntTopProjectObj> arrayList = readCachedTopProjectByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFIntTopProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "deepDisposeTopProjectByTopDomainIdx";
		ICFIntTopProjectObj obj;
		List<ICFIntTopProjectObj> arrayList = readCachedTopProjectByTopDomainIdx( TenantId,
				TopDomainId );
		if( arrayList != null )  {
			Iterator<ICFIntTopProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		ICFIntTopProjectObj obj = readCachedTopProjectByNameIdx( TenantId,
				TopDomainId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFIntTopProjectObj updateTopProject( ICFIntTopProjectObj Obj ) {
		ICFIntTopProjectObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableTopProject().updateTopProject( schema.getAuthorization(),
			Obj.getTopProjectBuff() );
		obj = (ICFIntTopProjectObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTopProject( ICFIntTopProjectObj Obj ) {
		ICFIntTopProjectObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProject( schema.getAuthorization(),
			obj.getTopProjectBuff() );
		Obj.forget();
	}

	public void deleteTopProjectByIdIdx( long TenantId,
		long Id )
	{
		CFIntTopProjectPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFIntTopProjectObj obj = readTopProject( pkey );
		if( obj != null ) {
			ICFIntTopProjectEditObj editObj = (ICFIntTopProjectEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFIntTopProjectEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeTopProjectByIdIdx( TenantId,
				Id );
	}

	public void deleteTopProjectByTenantIdx( long TenantId )
	{
		CFIntTopProjectByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFIntTopProjectByTenantIdxKey,
				Map< CFIntTopProjectPKey, ICFIntTopProjectObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFIntTopProjectObj> iter = dict.values().iterator();
			ICFIntTopProjectObj obj;
			List<ICFIntTopProjectObj> toForget = new LinkedList<ICFIntTopProjectObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTopProjectByTenantIdx( TenantId );
	}

	public void deleteTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		CFIntTopProjectByTopDomainIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		if( indexByTopDomainIdx == null ) {
			indexByTopDomainIdx = new HashMap< CFIntTopProjectByTopDomainIdxKey,
				Map< CFIntTopProjectPKey, ICFIntTopProjectObj > >();
		}
		if( indexByTopDomainIdx.containsKey( key ) ) {
			Map<CFIntTopProjectPKey, ICFIntTopProjectObj> dict = indexByTopDomainIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			Iterator<ICFIntTopProjectObj> iter = dict.values().iterator();
			ICFIntTopProjectObj obj;
			List<ICFIntTopProjectObj> toForget = new LinkedList<ICFIntTopProjectObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTopDomainIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
		}
		deepDisposeTopProjectByTopDomainIdx( TenantId,
				TopDomainId );
	}

	public void deleteTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFIntTopProjectByNameIdxKey,
				ICFIntTopProjectObj >();
		}
		CFIntTopProjectByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		ICFIntTopProjectObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
		}
		deepDisposeTopProjectByNameIdx( TenantId,
				TopDomainId,
				Name );
	}
}