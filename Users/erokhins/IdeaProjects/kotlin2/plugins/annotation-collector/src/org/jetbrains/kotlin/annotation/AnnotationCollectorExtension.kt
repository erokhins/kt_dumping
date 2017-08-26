'ShortenedNameCache' @ [51:44] ==> public constructor ShortenedNameCache(type: String) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[ClassConstructorDescriptorImpl]

'RecordTypes' @ [51:63] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'SHORTENED_ANNOTATION' @ [51:75] ==> public final val SHORTENED_ANNOTATION: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'ShortenedNameCache' @ [52:45] ==> public constructor ShortenedNameCache(type: String) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[ClassConstructorDescriptorImpl]

'RecordTypes' @ [52:64] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'SHORTENED_PACKAGE_NAME' @ [52:76] ==> public final val SHORTENED_PACKAGE_NAME: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'AnnotationCollectorClassBuilderFactory' @ [59:16] ==> public constructor AnnotationCollectorClassBuilderFactory(delegateFactory: ClassBuilderFactory, writer: Writer, diagnostics: DiagnosticSink) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory[ClassConstructorDescriptorImpl]

'interceptedFactory' @ [59:55] ==> value-parameter interceptedFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.interceptClassBuilderFactory[ValueParameterDescriptorImpl]

'getWriter' @ [59:75] ==> protected abstract fun getWriter(diagnostic: DiagnosticSink): Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[SimpleFunctionDescriptorImpl]

'diagnostics' @ [59:85] ==> value-parameter diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.interceptClassBuilderFactory[ValueParameterDescriptorImpl]

'diagnostics' @ [59:99] ==> value-parameter diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.interceptClassBuilderFactory[ValueParameterDescriptorImpl]

'DelegatingClassBuilderFactory' @ [69:9] ==> public constructor DelegatingClassBuilderFactory(delegate: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilderFactory[DeserializedClassConstructorDescriptor]

'delegateFactory' @ [69:39] ==> value-parameter delegateFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory.<init>[ValueParameterDescriptorImpl]

'AnnotationCollectorClassBuilder' @ [72:20] ==> public constructor AnnotationCollectorClassBuilder(delegateClassBuilder: ClassBuilder, writer: Writer, diagnostics: DiagnosticSink) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[ClassConstructorDescriptorImpl]

'delegate' @ [72:52] ==> protected final val delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory[DeserializedPropertyDescriptor]

'newClassBuilder' @ [72:61] ==> @NotNull public abstract fun newClassBuilder(@NotNull p0: JvmDeclarationOrigin): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'origin' @ [72:77] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'writer' @ [72:86] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory[PropertyDescriptorImpl]

'diagnostics' @ [72:94] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory[PropertyDescriptorImpl]

'closeWriter' @ [76:13] ==> protected abstract fun closeWriter(): Unit defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[SimpleFunctionDescriptorImpl]

'delegate' @ [77:13] ==> protected final val delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilderFactory[DeserializedPropertyDescriptor]

'close' @ [77:22] ==> public abstract fun close(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'DelegatingClassBuilder' @ [85:9] ==> public constructor DelegatingClassBuilder() defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaClassConstructorDescriptor]

'annotationFilterList' @ [90:39] ==> protected abstract val annotationFilterList: List<String>? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[PropertyDescriptorImpl]

'map' @ [90:61] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pattern?): List<Pattern?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pattern?

'it' @ [90:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.<init>.<anonymous>[ValueParameterDescriptorImpl]

'compilePatternOpt' @ [90:70] ==> private final fun String.compilePatternOpt(): Pattern? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'listOf' @ [90:95] ==> @InlineOnly public inline fun <T> listOf(): List<Pattern?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pattern?

'annotationFilterEnabled' @ [91:13] ==> private final val annotationFilterEnabled: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'nullableAnnotations' @ [91:39] ==> val nullableAnnotations: List<Pattern?> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [91:59] ==> @InlineOnly public inline fun <T> Collection<Pattern?>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pattern?

'annotationFilters' @ [92:13] ==> private final val annotationFilters: List<Pattern> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'nullableAnnotations' @ [92:33] ==> val nullableAnnotations: List<Pattern?> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.<init>[LocalVariableDescriptor]

'filterNotNull' @ [92:53] ==> public fun <T : Any> Iterable<Pattern?>.filterNotNull(): List<Pattern> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Pattern

'lazy' @ [95:51] ==> public fun <T> lazy(initializer: () -> <no name provided>): Lazy<<no name provided>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'ClassVisitor' @ [96:22] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [96:43] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'super' @ [96:49] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'getVisitor' @ [96:55] ==> @NotNull public open fun getVisitor(): ClassVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'recordAnnotation' @ [98:21] ==> private final fun recordAnnotation(name: String?, type: String, annotationDesc: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'RecordTypes' @ [98:44] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'ANNOTATED_CLASS' @ [98:56] ==> public final val ANNOTATED_CLASS: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'desc' @ [98:73] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.classVisitor.<anonymous>.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'super' @ [99:28] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.classVisitor.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [99:34] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'desc' @ [99:50] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.classVisitor.<anonymous>.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [99:56] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.classVisitor.<anonymous>.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'classVisitor' @ [108:37] ==> private final val classVisitor: ClassVisitor defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'delegateClassBuilder' @ [110:38] ==> internal final val delegateClassBuilder: ClassBuilder defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'name' @ [121:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'substringAfterLast' @ [121:47] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [122:38] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'substringBeforeLast' @ [122:43] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [122:72] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [124:13] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'currentClassSimpleName' @ [124:18] ==> private final lateinit var currentClassSimpleName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'currentClassSimpleName' @ [124:43] ==> val currentClassSimpleName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[LocalVariableDescriptor]

'this' @ [125:13] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'currentPackageName' @ [125:18] ==> private final lateinit var currentPackageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'currentPackageName' @ [125:39] ==> val currentPackageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[LocalVariableDescriptor]

'supportInheritedAnnotations' @ [127:17] ==> public final val supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[PropertyDescriptorImpl]

'recordClass' @ [128:17] ==> private final fun recordClass(packageName: String, className: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'currentPackageName' @ [128:29] ==> val currentPackageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[LocalVariableDescriptor]

'currentClassSimpleName' @ [128:49] ==> val currentClassSimpleName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[LocalVariableDescriptor]

'super' @ [131:13] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'defineClass' @ [131:19] ==> public open fun defineClass(@Nullable p0: PsiElement?, p1: Int, p2: Int, @NotNull p3: String, @Nullable p4: String?, @NotNull p5: String, @NotNull p6: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [131:31] ==> value-parameter origin: PsiElement? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'version' @ [131:39] ==> value-parameter version: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'access' @ [131:48] ==> value-parameter access: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'name' @ [131:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signature' @ [131:62] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'superName' @ [131:73] ==> value-parameter superName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'interfaces' @ [131:84] ==> value-parameter interfaces: Array<out String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.defineClass[ValueParameterDescriptorImpl]

'FieldVisitor' @ [142:29] ==> public constructor FieldVisitor(p0: Int, p1: (FieldVisitor..FieldVisitor?)) defined in org.jetbrains.org.objectweb.asm.FieldVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [142:50] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'super' @ [142:56] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'newField' @ [142:62] ==> @NotNull public open fun newField(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [142:71] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'access' @ [142:79] ==> value-parameter access: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'name' @ [142:87] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'desc' @ [142:93] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'signature' @ [142:99] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'value' @ [142:110] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'recordAnnotation' @ [144:21] ==> private final fun recordAnnotation(name: String?, type: String, annotationDesc: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'name' @ [144:38] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField[ValueParameterDescriptorImpl]

'RecordTypes' @ [144:44] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'ANNOTATED_FIELD' @ [144:56] ==> public final val ANNOTATED_FIELD: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'desc' @ [144:73] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'super' @ [145:28] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [145:34] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.FieldVisitor[JavaMethodDescriptor]

'desc' @ [145:50] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [145:56] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newField.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'MethodVisitor' @ [158:29] ==> public constructor MethodVisitor(p0: Int, p1: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [158:51] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'super' @ [158:57] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'newMethod' @ [158:63] ==> @NotNull public open fun newMethod(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [158:73] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'access' @ [158:81] ==> value-parameter access: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'name' @ [158:89] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [158:95] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'signature' @ [158:101] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [158:112] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'recordAnnotation' @ [160:21] ==> private final fun recordAnnotation(name: String?, type: String, annotationDesc: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'name' @ [160:38] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod[ValueParameterDescriptorImpl]

'RecordTypes' @ [160:44] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'ANNOTATED_METHOD' @ [160:56] ==> public final val ANNOTATED_METHOD: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'desc' @ [160:74] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'super' @ [161:28] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [161:34] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'desc' @ [161:50] ==> value-parameter desc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [161:56] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.newMethod.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'if (annotationFilterEnabled)
                annotationFilters.any { it.matcher(annotationFqName).matches() }
            else annotationFqName != JvmAnnotationNames.METADATA_FQ_NAME.asString()' @ [167:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'annotationFilterEnabled' @ [167:24] ==> private final val annotationFilterEnabled: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'annotationFilters' @ [168:17] ==> private final val annotationFilters: List<Pattern> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'any' @ [168:35] ==> public inline fun <T> Iterable<Pattern>.any(predicate: (Pattern) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pattern

'it' @ [168:41] ==> value-parameter it: Pattern defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.isAnnotationHandled.<anonymous>[ValueParameterDescriptorImpl]

'matcher' @ [168:44] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'annotationFqName' @ [168:52] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.isAnnotationHandled[ValueParameterDescriptorImpl]

'matches' @ [168:70] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'annotationFqName' @ [169:18] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.isAnnotationHandled[ValueParameterDescriptorImpl]

'METADATA_FQ_NAME' @ [169:57] ==> public final val METADATA_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'asString' @ [169:74] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'!' @ [173:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [173:18] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'packageName' @ [173:30] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[ValueParameterDescriptorImpl]

'!' @ [173:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [173:47] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'className' @ [173:59] ==> value-parameter className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[ValueParameterDescriptorImpl]

'if (!packageName.isEmpty())
                shortenedPackageNameCache.save(packageName, writer)
            else null' @ [175:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [175:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageName' @ [175:38] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[ValueParameterDescriptorImpl]

'isEmpty' @ [175:50] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'shortenedPackageNameCache' @ [176:17] ==> private final val shortenedPackageNameCache: AnnotationCollectorExtensionBase.ShortenedNameCache defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[PropertyDescriptorImpl]

'save' @ [176:43] ==> public final fun save(name: String, writer: Writer): String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[SimpleFunctionDescriptorImpl]

'packageName' @ [176:48] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[ValueParameterDescriptorImpl]

'writer' @ [176:61] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'getOutputClassName' @ [179:35] ==> private final fun getOutputClassName(packageNameId: String?, className: String): String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'packageNameId' @ [179:54] ==> val packageNameId: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[LocalVariableDescriptor]

'className' @ [179:69] ==> value-parameter className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[ValueParameterDescriptorImpl]

'writer' @ [180:13] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'write' @ [180:20] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'RecordTypes' @ [180:29] ==> private object RecordTypes defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[FakeCallableDescriptorForObject]

'CLASS_DECLARATION' @ [180:41] ==> public final val CLASS_DECLARATION: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.RecordTypes[PropertyDescriptorImpl]

'outputClassName' @ [180:61] ==> val outputClassName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordClass[LocalVariableDescriptor]

'getType' @ [184:41] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'annotationDesc' @ [184:49] ==> value-parameter annotationDesc: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'className' @ [184:65] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'!' @ [185:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationHandled' @ [185:18] ==> private final fun isAnnotationHandled(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [185:38] ==> val annotationFqName: (String..String?) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'!' @ [185:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [185:60] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [185:72] ==> val annotationFqName: (String..String?) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'name' @ [187:17] ==> value-parameter name: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'!' @ [187:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [187:34] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'name' @ [187:46] ==> value-parameter name: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'this' @ [190:35] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'currentPackageName' @ [190:40] ==> private final lateinit var currentPackageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'!' @ [191:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [191:22] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'packageName' @ [191:34] ==> val packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'this' @ [193:33] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[LazyClassReceiverParameterDescriptor]

'currentClassSimpleName' @ [193:38] ==> private final lateinit var currentClassSimpleName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'!' @ [194:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidName' @ [194:22] ==> private final fun isValidName(name: String): Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'className' @ [194:34] ==> val className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'shortenedAnnotationCache' @ [196:36] ==> private final val shortenedAnnotationCache: AnnotationCollectorExtensionBase.ShortenedNameCache defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[PropertyDescriptorImpl]

'save' @ [196:61] ==> public final fun save(name: String, writer: Writer): String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [196:66] ==> val annotationFqName: (String..String?) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'writer' @ [196:84] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'if (!packageName.isEmpty())
                    shortenedPackageNameCache.save(packageName, writer)
                else null' @ [198:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [198:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageName' @ [198:42] ==> val packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'isEmpty' @ [198:54] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'shortenedPackageNameCache' @ [199:21] ==> private final val shortenedPackageNameCache: AnnotationCollectorExtensionBase.ShortenedNameCache defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[PropertyDescriptorImpl]

'save' @ [199:47] ==> public final fun save(name: String, writer: Writer): String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[SimpleFunctionDescriptorImpl]

'packageName' @ [199:52] ==> val packageName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'writer' @ [199:65] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'getOutputClassName' @ [202:39] ==> private final fun getOutputClassName(packageNameId: String?, className: String): String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[SimpleFunctionDescriptorImpl]

'packageNameId' @ [202:58] ==> val packageNameId: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'className' @ [202:73] ==> val className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'if (name != null) " $name" else ""' @ [203:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'name' @ [203:39] ==> value-parameter name: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'name' @ [203:56] ==> value-parameter name: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'writer' @ [205:17] ==> public final val writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder[PropertyDescriptorImpl]

'write' @ [205:24] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'type' @ [205:32] ==> value-parameter type: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[ValueParameterDescriptorImpl]

'annotationId' @ [205:38] ==> val annotationId: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'outputClassName' @ [205:52] ==> val outputClassName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'elementName' @ [205:68] ==> val elementName: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'e' @ [208:23] ==> val e: IOException defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.recordAnnotation[LocalVariableDescriptor]

'!in' @ [213:20] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [213:28] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.isValidName[ValueParameterDescriptorImpl]

'if (packageNameId == null) className else "$packageNameId/$className"' @ [217:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'packageNameId' @ [217:24] ==> value-parameter packageNameId: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.getOutputClassName[ValueParameterDescriptorImpl]

'className' @ [217:47] ==> value-parameter className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.getOutputClassName[ValueParameterDescriptorImpl]

'packageNameId' @ [217:64] ==> value-parameter packageNameId: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.getOutputClassName[ValueParameterDescriptorImpl]

'className' @ [217:79] ==> value-parameter className: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.getOutputClassName[ValueParameterDescriptorImpl]

'compile' @ [222:25] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'this' @ [222:33] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.AnnotationCollectorClassBuilder.compilePatternOpt[ReceiverParameterDescriptorImpl]

'hashMapOf' @ [231:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'internalCache' @ [235:20] ==> private final val internalCache: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[PropertyDescriptorImpl]

'getOrPut' @ [235:34] ==> public inline fun <K, V> MutableMap<String, String>.getOrPut(key: String, defaultValue: () -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'name' @ [235:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache.save[ValueParameterDescriptorImpl]

'counter' @ [236:32] ==> private final var counter: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[PropertyDescriptorImpl]

'toString' @ [236:40] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'writer' @ [237:17] ==> value-parameter writer: Writer defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache.save[ValueParameterDescriptorImpl]

'write' @ [237:24] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'type' @ [237:32] ==> public final val type: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[PropertyDescriptorImpl]

'name' @ [237:38] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache.save[ValueParameterDescriptorImpl]

'resultId' @ [237:44] ==> val resultId: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache.save.<anonymous>[LocalVariableDescriptor]

'counter' @ [238:17] ==> private final var counter: Int defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache[PropertyDescriptorImpl]

'resultId' @ [239:17] ==> val resultId: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase.ShortenedNameCache.save.<anonymous>[LocalVariableDescriptor]

'AnnotationCollectorExtensionBase' @ [249:5] ==> public constructor AnnotationCollectorExtensionBase(supportInheritedAnnotations: Boolean) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[ClassConstructorDescriptorImpl]

'supportInheritedAnnotations' @ [249:38] ==> value-parameter supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension.<init>[ValueParameterDescriptorImpl]

'writerInternal' @ [254:9] ==> private final var writerInternal: Writer? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[PropertyDescriptorImpl]

'close' @ [254:25] ==> public abstract fun close(): Unit defined in java.io.Writer[JavaMethodDescriptor]

'writerInternal' @ [258:16] ==> private final var writerInternal: Writer? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[PropertyDescriptorImpl]

'with' @ [259:13] ==> @InlineOnly public inline fun <T, R> with(receiver: File, block: File.() -> Writer): Writer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Writer

'File' @ [259:19] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFilename' @ [259:24] ==> private final val outputFilename: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[PropertyDescriptorImpl]

'parentFile' @ [260:30] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'!' @ [261:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [261:22] ==> val parent: (File..File?) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension.getWriter.<anonymous>[LocalVariableDescriptor]

'exists' @ [261:29] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'parent' @ [261:39] ==> val parent: (File..File?) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension.getWriter.<anonymous>[LocalVariableDescriptor]

'mkdirs' @ [261:46] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'writerInternal' @ [262:17] ==> private final var writerInternal: Writer? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[PropertyDescriptorImpl]

'bufferedWriter' @ [262:34] ==> @InlineOnly public inline fun File.bufferedWriter(charset: Charset = ..., bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writerInternal' @ [263:17] ==> private final var writerInternal: Writer? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[PropertyDescriptorImpl]

'e' @ [267:19] ==> val e: IOException defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension.getWriter[LocalVariableDescriptor]

