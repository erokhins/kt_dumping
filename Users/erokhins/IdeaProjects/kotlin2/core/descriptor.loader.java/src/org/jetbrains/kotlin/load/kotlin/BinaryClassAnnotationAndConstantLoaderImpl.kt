'AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget>' @ [44:5] ==> public constructor AbstractBinaryClassAnnotationAndConstantLoader<A : Any, C : Any, T : Any>(storageManager: StorageManager, kotlinClassFinder: KotlinClassFinder) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[ClassConstructorDescriptorImpl]
Inferred types:
    <A : Any> -> AnnotationDescriptor
    <C : Any> -> ConstantValue<*>
    <T : Any> -> AnnotationWithTarget

'storageManager' @ [45:9] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.<init>[ValueParameterDescriptorImpl]

'kotlinClassFinder' @ [45:25] ==> value-parameter kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.<init>[ValueParameterDescriptorImpl]

'AnnotationDeserializer' @ [47:42] ==> public constructor AnnotationDeserializer(module: ModuleDescriptor, notFoundClasses: NotFoundClasses) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[DeserializedClassConstructorDescriptor]

'module' @ [47:65] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'notFoundClasses' @ [47:73] ==> private final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'ConstantValueFactory' @ [48:27] ==> public constructor ConstantValueFactory(builtins: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedClassConstructorDescriptor]

'module' @ [48:48] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'builtIns' @ [48:55] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'annotationDeserializer' @ [51:13] ==> private final val annotationDeserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [51:36] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[DeserializedSimpleFunctionDescriptor]

'proto' @ [51:58] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadTypeAnnotation[ValueParameterDescriptorImpl]

'nameResolver' @ [51:65] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadTypeAnnotation[ValueParameterDescriptorImpl]

'if (desc in "ZBCS") {
            val intValue = initializer as Int
            when (desc) {
                "Z" -> intValue != 0
                "B" -> intValue.toByte()
                "C" -> intValue.toChar()
                "S" -> intValue.toShort()
                else -> throw AssertionError(desc)
            }
        }
        else {
            initializer
        }' @ [54:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'desc' @ [54:40] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[ValueParameterDescriptorImpl]

'initializer' @ [55:28] ==> value-parameter initializer: Any defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[ValueParameterDescriptorImpl]

'when (desc) {
                "Z" -> intValue != 0
                "B" -> intValue.toByte()
                "C" -> intValue.toChar()
                "S" -> intValue.toShort()
                else -> throw AssertionError(desc)
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}, entry1: {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}, entry2: {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}, entry3: {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}, entry4: {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}): {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> {Comparable<{Boolean & Byte & Char & Short}> & java.io.Serializable}

'desc' @ [56:19] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[ValueParameterDescriptorImpl]

'intValue' @ [57:24] ==> val intValue: Int defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[LocalVariableDescriptor]

'intValue' @ [58:24] ==> val intValue: Int defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[LocalVariableDescriptor]

'toByte' @ [58:33] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'intValue' @ [59:24] ==> val intValue: Int defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[LocalVariableDescriptor]

'toChar' @ [59:33] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'intValue' @ [60:24] ==> val intValue: Int defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[LocalVariableDescriptor]

'toShort' @ [60:33] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [61:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'desc' @ [61:46] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[ValueParameterDescriptorImpl]

'initializer' @ [65:13] ==> value-parameter initializer: Any defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[ValueParameterDescriptorImpl]

'factory' @ [68:16] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createConstantValue' @ [68:24] ==> public final fun createConstantValue(value: Any?): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'normalizedValue' @ [68:44] ==> val normalizedValue: Any defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadConstant[LocalVariableDescriptor]

'propertyAnnotations' @ [76:16] ==> value-parameter propertyAnnotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadPropertyAnnotations[ValueParameterDescriptorImpl]

'map' @ [76:36] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [76:42] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [76:63] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadPropertyAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'fieldAnnotations' @ [77:16] ==> value-parameter fieldAnnotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadPropertyAnnotations[ValueParameterDescriptorImpl]

'map' @ [77:33] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [77:39] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [77:60] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadPropertyAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'fieldUseSiteTarget' @ [77:64] ==> value-parameter fieldUseSiteTarget: AnnotationUseSiteTarget defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadPropertyAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [81:16] ==> value-parameter annotations: List<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.transformAnnotations[ValueParameterDescriptorImpl]

'map' @ [81:28] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [81:34] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [81:55] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.transformAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'resolveClass' @ [89:31] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[SimpleFunctionDescriptorImpl]

'annotationClassId' @ [89:44] ==> value-parameter annotationClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation[ValueParameterDescriptorImpl]

'HashMap' @ [92:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> ConstantValue<*>

'name' @ [95:21] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'arguments' @ [96:21] ==> private final val arguments: HashMap<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[PropertyDescriptorImpl]

'name' @ [96:31] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'createConstant' @ [96:39] ==> private final fun createConstant(name: Name?, value: Any?): ConstantValue<*> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[SimpleFunctionDescriptorImpl]

'name' @ [96:54] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'value' @ [96:60] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'arguments' @ [101:17] ==> private final val arguments: HashMap<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[PropertyDescriptorImpl]

'name' @ [101:27] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitEnum[ValueParameterDescriptorImpl]

'enumEntryValue' @ [101:35] ==> private final fun enumEntryValue(enumClassId: ClassId, name: Name): ConstantValue<*> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[SimpleFunctionDescriptorImpl]

'enumClassId' @ [101:50] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitEnum[ValueParameterDescriptorImpl]

'enumEntryName' @ [101:63] ==> value-parameter enumEntryName: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitEnum[ValueParameterDescriptorImpl]

'ArrayList' @ [106:44] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ConstantValue<*>

'elements' @ [109:25] ==> private final val elements: ArrayList<ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>[PropertyDescriptorImpl]

'add' @ [109:34] ==> public open fun add(element: ConstantValue<*>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createConstant' @ [109:38] ==> private final fun createConstant(name: Name?, value: Any?): ConstantValue<*> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[SimpleFunctionDescriptorImpl]

'name' @ [109:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray[ValueParameterDescriptorImpl]

'value' @ [109:59] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>.visit[ValueParameterDescriptorImpl]

'elements' @ [113:25] ==> private final val elements: ArrayList<ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>[PropertyDescriptorImpl]

'add' @ [113:34] ==> public open fun add(element: ConstantValue<*>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'enumEntryValue' @ [113:38] ==> private final fun enumEntryValue(enumClassId: ClassId, name: Name): ConstantValue<*> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[SimpleFunctionDescriptorImpl]

'enumClassId' @ [113:53] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>.visitEnum[ValueParameterDescriptorImpl]

'enumEntryName' @ [113:66] ==> value-parameter enumEntryName: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>.visitEnum[ValueParameterDescriptorImpl]

'getAnnotationParameterByName' @ [117:65] ==> @Nullable public open fun getAnnotationParameterByName(@NotNull name: Name, @NotNull annotationClass: ClassDescriptor): ValueParameterDescriptor? defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]

'name' @ [117:94] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray[ValueParameterDescriptorImpl]

'annotationClass' @ [117:100] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation[LocalVariableDescriptor]

'parameter' @ [118:29] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>.visitEnd[LocalVariableDescriptor]

'arguments' @ [119:29] ==> private final val arguments: HashMap<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[PropertyDescriptorImpl]

'name' @ [119:39] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray[ValueParameterDescriptorImpl]

'factory' @ [119:47] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createArrayValue' @ [119:55] ==> public final fun createArrayValue(value: List<ConstantValue<*>>, type: KotlinType): ArrayValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'elements' @ [119:72] ==> private final val elements: ArrayList<ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>[PropertyDescriptorImpl]

'compact' @ [119:81] ==> public fun <T> ArrayList<ConstantValue<*>>.compact(): List<ConstantValue<*>> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>

'parameter' @ [119:92] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitArray.<no name provided>.visitEnd[LocalVariableDescriptor]

'type' @ [119:102] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'ArrayList' @ [126:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AnnotationDescriptor

'loadAnnotation' @ [127:31] ==> protected open fun loadAnnotation(annotationClassId: ClassId, source: SourceElement, result: MutableList<AnnotationDescriptor>): KotlinJvmBinaryClass.AnnotationArgumentVisitor? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[SimpleFunctionDescriptorImpl]

'classId' @ [127:46] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [127:69] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'list' @ [127:80] ==> val list: ArrayList<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'visitor' @ [128:82] ==> val visitor: KotlinJvmBinaryClass.AnnotationArgumentVisitor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'visitor' @ [130:25] ==> val visitor: KotlinJvmBinaryClass.AnnotationArgumentVisitor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'visitEnd' @ [130:33] ==> public abstract fun visitEnd(): Unit defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor[SimpleFunctionDescriptorImpl]

'arguments' @ [131:25] ==> private final val arguments: HashMap<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[PropertyDescriptorImpl]

'name' @ [131:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'AnnotationValue' @ [131:43] ==> public constructor AnnotationValue(value: AnnotationDescriptor) defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue[DeserializedClassConstructorDescriptor]

'list' @ [131:59] ==> val list: ArrayList<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'single' @ [131:64] ==> public fun <T> List<AnnotationDescriptor>.single(): AnnotationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'resolveClass' @ [138:33] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[SimpleFunctionDescriptorImpl]

'enumClassId' @ [138:46] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[ValueParameterDescriptorImpl]

'enumClass' @ [139:21] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[LocalVariableDescriptor]

'kind' @ [139:31] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [139:49] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'enumClass' @ [140:38] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[LocalVariableDescriptor]

'unsubstitutedInnerClassesScope' @ [140:48] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [140:79] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [140:104] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[ValueParameterDescriptorImpl]

'FROM_JAVA_LOADER' @ [140:127] ==> enum entry FROM_JAVA_LOADER defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [141:25] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[LocalVariableDescriptor]

'factory' @ [142:32] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createEnumValue' @ [142:40] ==> public final fun createEnumValue(enumEntryClass: ClassDescriptor): EnumValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'classifier' @ [142:56] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[LocalVariableDescriptor]

'factory' @ [145:24] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createErrorValue' @ [145:32] ==> public final fun createErrorValue(message: String): ErrorValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'enumClassId' @ [145:74] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[ValueParameterDescriptorImpl]

'name' @ [145:87] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.enumEntryValue[ValueParameterDescriptorImpl]

'result' @ [149:17] ==> value-parameter result: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation[ValueParameterDescriptorImpl]

'add' @ [149:24] ==> public abstract fun add(element: AnnotationDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'AnnotationDescriptorImpl' @ [149:28] ==> public constructor AnnotationDescriptorImpl(@NotNull p0: KotlinType, @NotNull p1: (MutableMap<(Name..Name?), (ConstantValue<*>..ConstantValue<*>?)>..Map<(Name..Name?), (ConstantValue<*>..ConstantValue<*>?)>), @NotNull p2: SourceElement) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptorImpl[JavaClassConstructorDescriptor]

'annotationClass' @ [149:53] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation[LocalVariableDescriptor]

'defaultType' @ [149:69] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'arguments' @ [149:82] ==> private final val arguments: HashMap<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>[PropertyDescriptorImpl]

'source' @ [149:93] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation[ValueParameterDescriptorImpl]

'factory' @ [153:24] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createConstantValue' @ [153:32] ==> public final fun createConstantValue(value: Any?): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [153:52] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.createConstant[ValueParameterDescriptorImpl]

'factory' @ [154:24] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'createErrorValue' @ [154:32] ==> public final fun createErrorValue(message: String): ErrorValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [154:84] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.<no name provided>.createConstant[ValueParameterDescriptorImpl]

'module' @ [160:16] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'findNonGenericClassAcrossDependencies' @ [160:23] ==> public fun ModuleDescriptor.findNonGenericClassAcrossDependencies(classId: ClassId, notFoundClasses: NotFoundClasses): ClassDescriptor defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classId' @ [160:61] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.resolveClass[ValueParameterDescriptorImpl]

'notFoundClasses' @ [160:70] ==> private final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

