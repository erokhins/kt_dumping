'FqName' @ [50:27] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'source' @ [53:18] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'when (source) {
        is KotlinJvmBinarySourceElement -> {
            (source.binaryClass as ReflectKotlinClass).klass
        }
        is RuntimeSourceElementFactory.RuntimeSourceElement -> {
            (source.javaElement as ReflectJavaClass).element
        }
        else -> {
            // If this is neither a Kotlin class nor a Java class, it's likely either a built-in or some fake class descriptor like the one
            // that's created for java.io.Serializable in JvmBuiltInsSettings
            val classId = JavaToKotlinClassMap.mapKotlinToJava(DescriptorUtils.getFqName(this)) ?: classId ?: return null
            val packageName = classId.packageFqName.asString()
            val className = classId.relativeClassName.asString()
            // All pseudo-classes like kotlin.String.Companion must be accessible from the current class loader
            loadClass(javaClass.safeClassLoader, packageName, className)
        }
    }' @ [54:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>?, entry1: Class<*>?, entry2: Class<*>?): Class<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>?

'source' @ [54:18] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'source' @ [56:14] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'binaryClass' @ [56:21] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[PropertyDescriptorImpl]

'klass' @ [56:56] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'source' @ [59:14] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'javaElement' @ [59:21] ==> public open val javaElement: ReflectJavaElement defined in org.jetbrains.kotlin.load.java.components.RuntimeSourceElementFactory.RuntimeSourceElement[PropertyDescriptorImpl]

'element' @ [59:54] ==> public open val element: Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClass[PropertyDescriptorImpl]

'?:' @ [64:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassId?, right: ClassId?): ClassId?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassId?

'mapKotlinToJava' @ [64:48] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'getFqName' @ [64:80] ==> @NotNull public open fun getFqName(@NotNull descriptor: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [64:90] ==> <this> defined in kotlin.reflect.jvm.internal.toJavaClass[ReceiverParameterDescriptorImpl]

'classId' @ [64:100] ==> public val ClassifierDescriptorWithTypeParameters.classId: ClassId? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'classId' @ [65:31] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'packageFqName' @ [65:39] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [65:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'classId' @ [66:29] ==> val classId: ClassId defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'relativeClassName' @ [66:37] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [66:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'loadClass' @ [68:13] ==> internal fun loadClass(classLoader: ClassLoader, packageName: String, className: String): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'javaClass' @ [68:23] ==> public val <T : Any> ClassDescriptor.javaClass: Class<ClassDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'safeClassLoader' @ [68:33] ==> public val Class<*>.safeClassLoader: ClassLoader defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'packageName' @ [68:50] ==> val packageName: String defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'className' @ [68:63] ==> val className: String defined in kotlin.reflect.jvm.internal.toJavaClass[LocalVariableDescriptor]

'packageName' @ [74:9] ==> value-parameter packageName: String defined in kotlin.reflect.jvm.internal.loadClass[ValueParameterDescriptorImpl]

'when (className) {
            "Array" -> return Array<Any>::class.java
            "BooleanArray" -> return BooleanArray::class.java
            "ByteArray" -> return ByteArray::class.java
            "CharArray" -> return CharArray::class.java
            "DoubleArray" -> return DoubleArray::class.java
            "FloatArray" -> return FloatArray::class.java
            "IntArray" -> return IntArray::class.java
            "LongArray" -> return LongArray::class.java
            "ShortArray" -> return ShortArray::class.java
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing, entry5: Nothing, entry6: Nothing, entry7: Nothing, entry8: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'className' @ [76:15] ==> value-parameter className: String defined in kotlin.reflect.jvm.internal.loadClass[ValueParameterDescriptorImpl]

'Array' @ [77:31] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@8d8fab0

'java' @ [77:49] ==> public val <T> KClass<Array<Any>>.java: Class<Array<Any>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Any>

'java' @ [78:58] ==> public val <T> KClass<BooleanArray>.java: Class<BooleanArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BooleanArray

'java' @ [79:52] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'java' @ [80:52] ==> public val <T> KClass<CharArray>.java: Class<CharArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CharArray

'java' @ [81:56] ==> public val <T> KClass<DoubleArray>.java: Class<DoubleArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DoubleArray

'java' @ [82:54] ==> public val <T> KClass<FloatArray>.java: Class<FloatArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FloatArray

'java' @ [83:50] ==> public val <T> KClass<IntArray>.java: Class<IntArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntArray

'java' @ [84:52] ==> public val <T> KClass<LongArray>.java: Class<LongArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LongArray

'java' @ [85:54] ==> public val <T> KClass<ShortArray>.java: Class<ShortArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ShortArray

'classLoader' @ [89:12] ==> value-parameter classLoader: ClassLoader defined in kotlin.reflect.jvm.internal.loadClass[ValueParameterDescriptorImpl]

'tryLoadClass' @ [89:24] ==> public fun ClassLoader.tryLoadClass(fqName: String): Class<*>? defined in org.jetbrains.kotlin.load.java.reflect in file ReflectJavaClassFinder.kt[SimpleFunctionDescriptorImpl]

'packageName' @ [89:39] ==> value-parameter packageName: String defined in kotlin.reflect.jvm.internal.loadClass[ValueParameterDescriptorImpl]

'className' @ [89:53] ==> value-parameter className: String defined in kotlin.reflect.jvm.internal.loadClass[ValueParameterDescriptorImpl]

'replace' @ [89:63] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (this) {
            Visibilities.PUBLIC -> KVisibility.PUBLIC
            Visibilities.PROTECTED -> KVisibility.PROTECTED
            Visibilities.INTERNAL -> KVisibility.INTERNAL
            Visibilities.PRIVATE, Visibilities.PRIVATE_TO_THIS -> KVisibility.PRIVATE
            else -> null
        }' @ [93:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KVisibility?, entry1: KVisibility?, entry2: KVisibility?, entry3: KVisibility?, entry4: KVisibility?): KVisibility?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KVisibility?

'this' @ [93:15] ==> <this> defined in kotlin.reflect.jvm.internal.toKVisibility[ReceiverParameterDescriptorImpl]

'PUBLIC' @ [94:26] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC' @ [94:48] ==> enum entry PUBLIC defined in kotlin.reflect.KVisibility[FakeCallableDescriptorForObject]

'PROTECTED' @ [95:26] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PROTECTED' @ [95:51] ==> enum entry PROTECTED defined in kotlin.reflect.KVisibility[FakeCallableDescriptorForObject]

'INTERNAL' @ [96:26] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'INTERNAL' @ [96:50] ==> enum entry INTERNAL defined in kotlin.reflect.KVisibility[FakeCallableDescriptorForObject]

'PRIVATE' @ [97:26] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE_TO_THIS' @ [97:48] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE' @ [97:79] ==> enum entry PRIVATE defined in kotlin.reflect.KVisibility[FakeCallableDescriptorForObject]

'annotations' @ [102:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[PropertyDescriptorImpl]

'mapNotNull' @ [102:21] ==> public inline fun <T, R : Any> Iterable<AnnotationDescriptor>.mapNotNull(transform: (AnnotationDescriptor) -> Annotation?): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R : Any> -> Annotation

'it' @ [103:26] ==> value-parameter it: AnnotationDescriptor defined in kotlin.reflect.jvm.internal.computeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [103:29] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'when (source) {
                is ReflectAnnotationSource -> source.annotation
                is RuntimeSourceElementFactory.RuntimeSourceElement -> (source.javaElement as? ReflectJavaAnnotation)?.annotation
                else -> null
            }' @ [104:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Annotation?, entry1: Annotation?, entry2: Annotation?): Annotation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Annotation?

'source' @ [104:19] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.computeAnnotations.<anonymous>[LocalVariableDescriptor]

'source' @ [105:47] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.computeAnnotations.<anonymous>[LocalVariableDescriptor]

'annotation' @ [105:54] ==> public final val annotation: Annotation defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectAnnotationSource[PropertyDescriptorImpl]

'source' @ [106:73] ==> val source: SourceElement defined in kotlin.reflect.jvm.internal.computeAnnotations.<anonymous>[LocalVariableDescriptor]

'javaElement' @ [106:80] ==> public open val javaElement: ReflectJavaElement defined in org.jetbrains.kotlin.load.java.components.RuntimeSourceElementFactory.RuntimeSourceElement[PropertyDescriptorImpl]

'annotation' @ [106:120] ==> public final val annotation: Annotation defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotation[PropertyDescriptorImpl]

'invoke' @ [114:13] ==> public abstract operator fun invoke(): R defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalCallableAccessException' @ [117:19] ==> public constructor IllegalCallableAccessException(cause: IllegalAccessException) defined in kotlin.reflect.full.IllegalCallableAccessException[ClassConstructorDescriptorImpl]

'e' @ [117:50] ==> val e: IllegalAccessException defined in kotlin.reflect.jvm.internal.reflectionCall[LocalVariableDescriptor]

'this' @ [121:9] ==> <this> defined in kotlin.reflect.jvm.internal.asKFunctionImpl[ReceiverParameterDescriptorImpl]

'this' @ [122:10] ==> <this> defined in kotlin.reflect.jvm.internal.asKFunctionImpl[ReceiverParameterDescriptorImpl]

'compute' @ [122:39] ==> @SinceKotlin public open fun compute(): raw (KCallable<Any?>..KCallable<*>?) defined in kotlin.jvm.internal.FunctionReference[JavaMethodDescriptor]

'this' @ [125:9] ==> <this> defined in kotlin.reflect.jvm.internal.asKPropertyImpl[ReceiverParameterDescriptorImpl]

'this' @ [126:10] ==> <this> defined in kotlin.reflect.jvm.internal.asKPropertyImpl[ReceiverParameterDescriptorImpl]

'compute' @ [126:39] ==> @SinceKotlin public open fun compute(): raw (KCallable<Any?>..KCallable<*>?) defined in kotlin.jvm.internal.PropertyReference[JavaMethodDescriptor]

'this' @ [129:9] ==> <this> defined in kotlin.reflect.jvm.internal.asKCallableImpl[ReceiverParameterDescriptorImpl]

'asKFunctionImpl' @ [129:38] ==> internal fun Any?.asKFunctionImpl(): KFunctionImpl? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'asKPropertyImpl' @ [129:59] ==> internal fun Any?.asKPropertyImpl(): KPropertyImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'classHeader' @ [133:22] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'!' @ [134:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'header' @ [134:14] ==> val header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'metadataVersion' @ [134:21] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'isCompatible' @ [134:37] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[SimpleFunctionDescriptorImpl]

'when (header.kind) {
            KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                // TODO: avoid reading and parsing metadata twice (here and later in KPackageImpl#descriptor)
                val (nameResolver, proto) = JvmProtoBufUtil.readPackageDataFrom(header.data!!, header.strings!!)
                // If no packageModuleName extension is written, the name is assumed to be JvmAbi.DEFAULT_MODULE_NAME
                // (see JvmSerializerExtension.serializePackage)
                if (proto.hasExtension(JvmProtoBuf.packageModuleName))
                    nameResolver.getString(proto.getExtension(JvmProtoBuf.packageModuleName))
                else JvmAbi.DEFAULT_MODULE_NAME
            }
            KotlinClassHeader.Kind.MULTIFILE_CLASS -> {
                val partName = header.multifilePartNames.firstOrNull() ?: return null
                ReflectKotlinClass.create(klass.classLoader.loadClass(partName.replace('/', '.')))?.packageModuleName
            }
            else -> null
        }' @ [136:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'header' @ [136:22] ==> val header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'kind' @ [136:29] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'FILE_FACADE' @ [137:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [137:72] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'component1' @ [139:22] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[SimpleFunctionDescriptorImpl]

'component2' @ [139:36] ==> public final operator fun component2(): ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[SimpleFunctionDescriptorImpl]

'JvmProtoBufUtil' @ [139:45] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [139:61] ==> @JvmStatic public final fun readPackageDataFrom(data: Array<String>, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'header' @ [139:81] ==> val header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'data' @ [139:88] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'header' @ [139:96] ==> val header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'strings' @ [139:103] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'if (proto.hasExtension(JvmProtoBuf.packageModuleName))
                    nameResolver.getString(proto.getExtension(JvmProtoBuf.packageModuleName))
                else JvmAbi.DEFAULT_MODULE_NAME' @ [142:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'proto' @ [142:21] ==> val proto: ProtoBuf.Package defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'hasExtension' @ [142:27] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'packageModuleName' @ [142:52] ==> public final val packageModuleName: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'nameResolver' @ [143:21] ==> val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'getString' @ [143:34] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [143:44] ==> val proto: ProtoBuf.Package defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'getExtension' @ [143:50] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'packageModuleName' @ [143:75] ==> public final val packageModuleName: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'DEFAULT_MODULE_NAME' @ [144:29] ==> public const final val DEFAULT_MODULE_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'MULTIFILE_CLASS' @ [146:36] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'header' @ [147:32] ==> val header: KotlinClassHeader defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'multifilePartNames' @ [147:39] ==> public final val multifilePartNames: List<String> defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'firstOrNull' @ [147:58] ==> public fun <T> List<String>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'create' @ [148:36] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[SimpleFunctionDescriptorImpl]

'klass' @ [148:43] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'classLoader' @ [148:49] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'loadClass' @ [148:61] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'partName' @ [148:71] ==> val partName: String defined in kotlin.reflect.jvm.internal.<get-packageModuleName>[LocalVariableDescriptor]

'replace' @ [148:80] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageModuleName' @ [148:101] ==> internal val ReflectKotlinClass.packageModuleName: String? defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'visibility' @ [156:26] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'visibility' @ [157:17] ==> val visibility: Visibility defined in kotlin.reflect.jvm.internal.<get-isPublicInBytecode>[LocalVariableDescriptor]

'PUBLIC' @ [157:44] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'visibility' @ [157:54] ==> val visibility: Visibility defined in kotlin.reflect.jvm.internal.<get-isPublicInBytecode>[LocalVariableDescriptor]

'INTERNAL' @ [157:81] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'!' @ [157:94] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEffectivelyInlineOnly' @ [157:95] ==> public fun MemberDescriptor.isEffectivelyInlineOnly(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations in file annotationUtil.kt[SimpleFunctionDescriptorImpl]

'moduleAnchor' @ [167:22] ==> value-parameter moduleAnchor: Class<*> defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'getOrCreateModule' @ [167:35] ==> internal fun Class<*>.getOrCreateModule(): RuntimeModuleData defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[SimpleFunctionDescriptorImpl]

'when (proto) {
        is ProtoBuf.Function -> proto.typeParameterList
        is ProtoBuf.Property -> proto.typeParameterList
        else -> error("Unsupported message: $proto")
    }' @ [169:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?), entry1: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?), entry2: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)): (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter..org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter..org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter?)>?)

'proto' @ [169:32] ==> value-parameter proto: M defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'proto' @ [170:33] ==> value-parameter proto: M defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'typeParameterList' @ [170:39] ==> public final val ProtoBuf.Function.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'proto' @ [171:33] ==> value-parameter proto: M defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'typeParameterList' @ [171:39] ==> public final val ProtoBuf.Property.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'error' @ [172:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'proto' @ [172:46] ==> value-parameter proto: M defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'DeserializationContext' @ [175:19] ==> public constructor DeserializationContext(components: DeserializationComponents, nameResolver: NameResolver, containingDeclaration: DeclarationDescriptor, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?, parentTypeDeserializer: TypeDeserializer?, typeParameters: List<ProtoBuf.TypeParameter>) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[ClassConstructorDescriptorImpl]

'moduleData' @ [176:13] ==> val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[LocalVariableDescriptor]

'deserialization' @ [176:24] ==> public final val deserialization: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'nameResolver' @ [176:41] ==> value-parameter nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'moduleData' @ [176:55] ==> val moduleData: RuntimeModuleData defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[LocalVariableDescriptor]

'module' @ [176:66] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[PropertyDescriptorImpl]

'typeTable' @ [176:74] ==> value-parameter typeTable: TypeTable defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

'EMPTY' @ [176:106] ==> public final val EMPTY: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion[PropertyDescriptorImpl]

'typeParameters' @ [177:85] ==> val typeParameters: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?) defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[LocalVariableDescriptor]

'MemberDeserializer' @ [179:12] ==> public constructor MemberDeserializer(c: DeserializationContext) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[ClassConstructorDescriptorImpl]

'context' @ [179:31] ==> val context: DeserializationContext defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[LocalVariableDescriptor]

'invoke' @ [179:40] ==> public abstract operator fun MemberDeserializer.invoke(p2: M): D defined in kotlin.Function2[FunctionInvokeDescriptor]

'proto' @ [179:57] ==> value-parameter proto: M defined in kotlin.reflect.jvm.internal.deserializeToDescriptor[ValueParameterDescriptorImpl]

