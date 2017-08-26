'NO_SOURCE' @ [28:79] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'proto' @ [31:13] ==> value-parameter proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder.<init>[ValueParameterDescriptorImpl]

'class_List' @ [31:19] ==> public final val ProtoBuf.PackageFragment.class_List: (MutableList<(ProtoBuf.Class..ProtoBuf.Class?)>..List<(ProtoBuf.Class..ProtoBuf.Class?)>?)[MyPropertyDescriptor]

'associateBy' @ [31:30] ==> public inline fun <T, K> Iterable<(ProtoBuf.Class..ProtoBuf.Class?)>.associateBy(keySelector: ((ProtoBuf.Class..ProtoBuf.Class?)) -> ClassId): Map<ClassId, (ProtoBuf.Class..ProtoBuf.Class?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class..org.jetbrains.kotlin.serialization.ProtoBuf.Class?)
    <K> -> ClassId

'nameResolver' @ [32:17] ==> private final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[PropertyDescriptorImpl]

'getClassId' @ [32:30] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'klass' @ [32:41] ==> value-parameter klass: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder.classIdToProto.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [32:47] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'classIdToProto' @ [35:59] ==> private final val classIdToProto: Map<ClassId, (ProtoBuf.Class..ProtoBuf.Class?)> defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[PropertyDescriptorImpl]

'keys' @ [35:74] ==> public abstract val keys: Set<ClassId> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'classIdToProto' @ [38:26] ==> private final val classIdToProto: Map<ClassId, (ProtoBuf.Class..ProtoBuf.Class?)> defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[PropertyDescriptorImpl]

'classId' @ [38:41] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder.findClassData[ValueParameterDescriptorImpl]

'ClassDataWithSource' @ [39:16] ==> public constructor ClassDataWithSource(classData: ClassData, sourceElement: SourceElement) defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[ClassConstructorDescriptorImpl]

'ClassData' @ [39:36] ==> public constructor ClassData(nameResolver: NameResolver, classProto: ProtoBuf.Class) defined in org.jetbrains.kotlin.serialization.ClassData[ClassConstructorDescriptorImpl]

'nameResolver' @ [39:46] ==> private final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[PropertyDescriptorImpl]

'classProto' @ [39:60] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder.findClassData[LocalVariableDescriptor]

'invoke' @ [39:73] ==> public abstract operator fun invoke(p1: ClassId): SourceElement defined in kotlin.Function1[FunctionInvokeDescriptor]

'classId' @ [39:85] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder.findClassData[ValueParameterDescriptorImpl]

