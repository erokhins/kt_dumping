'FileBasedKotlinClass' @ [32:5] ==> protected/*protected and package*/ constructor FileBasedKotlinClass(@NotNull p0: ClassId, p1: Int, @NotNull p2: KotlinClassHeader, @NotNull p3: FileBasedKotlinClass.InnerClassesInfo) defined in org.jetbrains.kotlin.load.kotlin.FileBasedKotlinClass[JavaClassConstructorDescriptor]

'className' @ [32:26] ==> value-parameter className: ClassId defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.<init>[ValueParameterDescriptorImpl]

'classVersion' @ [32:37] ==> value-parameter classVersion: Int defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.<init>[ValueParameterDescriptorImpl]

'classHeader' @ [32:51] ==> value-parameter classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.<init>[ValueParameterDescriptorImpl]

'innerClasses' @ [32:64] ==> value-parameter innerClasses: FileBasedKotlinClass.InnerClassesInfo defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.<init>[ValueParameterDescriptorImpl]

'file' @ [36:32] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create[ValueParameterDescriptorImpl]

'readBytes' @ [36:37] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'create' @ [37:41] ==> @Nullable public open fun <T : (FileBasedKotlinClass..FileBasedKotlinClass?)> create(@NotNull p0: ByteArray, @NotNull p1: ((ClassId..ClassId?), (Int..Int?), (KotlinClassHeader..KotlinClassHeader?), (FileBasedKotlinClass.InnerClassesInfo..FileBasedKotlinClass.InnerClassesInfo?)) -> (LocalFileKotlinClass..LocalFileKotlinClass?)): LocalFileKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.FileBasedKotlinClass[JavaMethodDescriptor]
Inferred types:
    <T : (FileBasedKotlinClass..FileBasedKotlinClass?)> -> (org.jetbrains.kotlin.incremental.LocalFileKotlinClass..org.jetbrains.kotlin.incremental.LocalFileKotlinClass?)

'fileContents' @ [37:48] ==> val fileContents: ByteArray defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create[LocalVariableDescriptor]

'LocalFileKotlinClass' @ [39:17] ==> private constructor LocalFileKotlinClass(file: File, fileContents: ByteArray, className: ClassId, classVersion: Int, classHeader: KotlinClassHeader, innerClasses: FileBasedKotlinClass.InnerClassesInfo) defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[ClassConstructorDescriptorImpl]

'file' @ [39:38] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create[ValueParameterDescriptorImpl]

'fileContents' @ [39:44] ==> val fileContents: ByteArray defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create[LocalVariableDescriptor]

'className' @ [39:58] ==> value-parameter className: (ClassId..ClassId?) defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'classVersion' @ [39:69] ==> value-parameter classVersion: (Int..Int?) defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'classHeader' @ [39:83] ==> value-parameter classHeader: (KotlinClassHeader..KotlinClassHeader?) defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'innerClasses' @ [39:96] ==> value-parameter innerClasses: (FileBasedKotlinClass.InnerClassesInfo..FileBasedKotlinClass.InnerClassesInfo?) defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [44:36] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'byClassId' @ [44:56] ==> @NotNull public open fun byClassId(@NotNull p0: ClassId): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'classId' @ [44:66] ==> public open val classId: ClassId defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'file' @ [47:17] ==> private final val file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'absolutePath' @ [47:22] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'fileContents' @ [49:56] ==> private final val fileContents: ByteArray defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'file' @ [51:36] ==> private final val file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'hashCode' @ [51:41] ==> public open fun hashCode(): Int defined in java.io.File[JavaMethodDescriptor]

'other' @ [52:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.equals[ValueParameterDescriptorImpl]

'file' @ [52:82] ==> private final val file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'other' @ [52:90] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.equals[ValueParameterDescriptorImpl]

'file' @ [52:96] ==> private final val file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'this' @ [53:42] ==> <this> defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[LazyClassReceiverParameterDescriptor]

'java' @ [53:54] ==> public val <T> KClass<out LocalFileKotlinClass>.java: Class<out LocalFileKotlinClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out LocalFileKotlinClass)

'file' @ [53:62] ==> private final val file: File defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

