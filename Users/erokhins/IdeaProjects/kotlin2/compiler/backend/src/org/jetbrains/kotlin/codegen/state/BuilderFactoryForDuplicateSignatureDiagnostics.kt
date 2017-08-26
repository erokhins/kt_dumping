'arrayOf' @ [39:38] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: JvmDeclarationOriginKind): Array<JvmDeclarationOriginKind> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> JvmDeclarationOriginKind

'CLASS_MEMBER_DELEGATION_TO_DEFAULT_IMPL' @ [40:34] ==> enum entry CLASS_MEMBER_DELEGATION_TO_DEFAULT_IMPL defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'DELEGATION' @ [41:34] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'BRIDGE' @ [42:34] ==> enum entry BRIDGE defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'listOf' @ [45:37] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [52:3] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> RawSignature): List<RawSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> RawSignature

'RawSignature' @ [53:5] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'signature' @ [53:18] ==> value-parameter signature: String defined in org.jetbrains.kotlin.codegen.state.PREDEFINED_SIGNATURES.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [53:28] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'signature' @ [53:50] ==> value-parameter signature: String defined in org.jetbrains.kotlin.codegen.state.PREDEFINED_SIGNATURES.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [53:60] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'signature' @ [53:70] ==> value-parameter signature: String defined in org.jetbrains.kotlin.codegen.state.PREDEFINED_SIGNATURES.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [53:80] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'METHOD' @ [53:106] ==> enum entry METHOD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'SignatureCollectingClassBuilderFactory' @ [63:5] ==> public constructor SignatureCollectingClassBuilderFactory(delegate: ClassBuilderFactory, shouldGenerate: (JvmDeclarationOrigin) -> Boolean) defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory[ClassConstructorDescriptorImpl]

'builderFactory' @ [63:44] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.<init>[ValueParameterDescriptorImpl]

'shouldGenerate' @ [63:60] ==> value-parameter shouldGenerate: (JvmDeclarationOrigin) -> Boolean defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.<init>[ValueParameterDescriptorImpl]

'KotlinTypeMapper' @ [66:30] ==> public constructor KotlinTypeMapper(@NotNull bindingContext: BindingContext, @NotNull classBuilderMode: ClassBuilderMode, @NotNull fileClassesProvider: JvmFileClassesProvider, @NotNull incompatibleClassTracker: IncompatibleClassTracker, @NotNull moduleName: String, isJvm8Target: Boolean, isJvm8TargetWithDefaults: Boolean) defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaClassConstructorDescriptor]

'bindingContext' @ [67:13] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.<init>[ValueParameterDescriptorImpl]

'LIGHT_CLASSES' @ [67:46] ==> public final val LIGHT_CLASSES: (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'fileClassesProvider' @ [67:61] ==> value-parameter fileClassesProvider: JvmFileClassesProvider defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.<init>[ValueParameterDescriptorImpl]

'DoNothing' @ [67:107] ==> public object DoNothing : IncompatibleClassTracker defined in org.jetbrains.kotlin.codegen.state.IncompatibleClassTracker[FakeCallableDescriptorForObject]

'moduleName' @ [67:118] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [69:42] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function0<Unit>

'reportDiagnosticsTasks' @ [72:9] ==> private final val reportDiagnosticsTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'forEach' @ [72:32] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [72:42] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'reportDiagnosticsTasks' @ [73:9] ==> private final val reportDiagnosticsTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'clear' @ [73:32] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'reportDiagnosticsTasks' @ [77:9] ==> private final val reportDiagnosticsTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'add' @ [77:32] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'reportConflictingJvmSignatures' @ [77:38] ==> private final fun reportConflictingJvmSignatures(data: ConflictingJvmDeclarationsData): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'data' @ [77:69] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.handleClashingSignatures[ValueParameterDescriptorImpl]

'data' @ [81:36] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[ValueParameterDescriptorImpl]

'signatureOrigins' @ [81:41] ==> public final val signatureOrigins: Collection<JvmDeclarationOrigin> defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'all' @ [81:58] ==> public inline fun <T> Iterable<JvmDeclarationOrigin>.all(predicate: (JvmDeclarationOrigin) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDeclarationOrigin

'it' @ [81:64] ==> value-parameter it: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures.<anonymous>[ValueParameterDescriptorImpl]

'originKind' @ [81:67] ==> public final val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'EXTERNAL_SOURCES_KINDS' @ [81:81] ==> private val EXTERNAL_SOURCES_KINDS: Array<JvmDeclarationOriginKind> defined in org.jetbrains.kotlin.codegen.state in file BuilderFactoryForDuplicateSignatureDiagnostics.kt[PropertyDescriptorImpl]

'LinkedHashSet' @ [83:24] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'if (noOwnImplementations) {
            elements.addIfNotNull(data.classOrigin.element)
        }
        else {
            for (origin in data.signatureOrigins) {
                var element = origin.element

                if (element == null || origin.originKind in EXTERNAL_SOURCES_KINDS) {
                    element = data.classOrigin.element
                }

                elements.addIfNotNull(element)
            }
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'noOwnImplementations' @ [84:13] ==> val noOwnImplementations: Boolean defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'elements' @ [85:13] ==> val elements: LinkedHashSet<PsiElement> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'addIfNotNull' @ [85:22] ==> public fun <T : Any> MutableCollection<PsiElement>.addIfNotNull(t: PsiElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'data' @ [85:35] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[ValueParameterDescriptorImpl]

'classOrigin' @ [85:40] ==> public final val classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'element' @ [85:52] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'data' @ [88:28] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[ValueParameterDescriptorImpl]

'signatureOrigins' @ [88:33] ==> public final val signatureOrigins: Collection<JvmDeclarationOrigin> defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'origin' @ [89:31] ==> val origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'element' @ [89:38] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'element' @ [91:21] ==> var element: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'origin' @ [91:40] ==> val origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'originKind' @ [91:47] ==> public final val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'EXTERNAL_SOURCES_KINDS' @ [91:61] ==> private val EXTERNAL_SOURCES_KINDS: Array<JvmDeclarationOriginKind> defined in org.jetbrains.kotlin.codegen.state in file BuilderFactoryForDuplicateSignatureDiagnostics.kt[PropertyDescriptorImpl]

'element' @ [92:21] ==> var element: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'data' @ [92:31] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[ValueParameterDescriptorImpl]

'classOrigin' @ [92:36] ==> public final val classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'element' @ [92:48] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'elements' @ [95:17] ==> val elements: LinkedHashSet<PsiElement> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'addIfNotNull' @ [95:26] ==> public fun <T : Any> MutableCollection<PsiElement>.addIfNotNull(t: PsiElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'element' @ [95:39] ==> var element: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'elements' @ [99:25] ==> val elements: LinkedHashSet<PsiElement> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'diagnostics' @ [100:13] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'report' @ [100:25] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CONFLICTING_JVM_DECLARATIONS' @ [100:42] ==> public final val CONFLICTING_JVM_DECLARATIONS: (DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [100:71] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: ConflictingJvmDeclarationsData): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [100:74] ==> val element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[LocalVariableDescriptor]

'data' @ [100:83] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportConflictingJvmSignatures[ValueParameterDescriptorImpl]

'reportDiagnosticsTasks' @ [109:9] ==> private final val reportDiagnosticsTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'add' @ [109:32] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'reportClashingWithPredefinedSignatures' @ [110:13] ==> private final fun reportClashingWithPredefinedSignatures(classOrigin: JvmDeclarationOrigin, classInternalName: String, signatures: MultiMap<RawSignature, JvmDeclarationOrigin>): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'classOrigin' @ [110:52] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'classInternalName' @ [110:65] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'signatures' @ [110:84] ==> value-parameter signatures: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'reportClashingSignaturesInHierarchy' @ [111:13] ==> private final fun reportClashingSignaturesInHierarchy(classOrigin: JvmDeclarationOrigin, classInternalName: String, signatures: MultiMap<RawSignature, JvmDeclarationOrigin>): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'classOrigin' @ [111:49] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'classInternalName' @ [111:62] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'signatures' @ [111:81] ==> value-parameter signatures: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.onClassDone[ValueParameterDescriptorImpl]

'PREDEFINED_SIGNATURES' @ [120:37] ==> private val PREDEFINED_SIGNATURES: List<RawSignature> defined in org.jetbrains.kotlin.codegen.state in file BuilderFactoryForDuplicateSignatureDiagnostics.kt[PropertyDescriptorImpl]

'!' @ [121:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'signatures' @ [121:18] ==> value-parameter signatures: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[ValueParameterDescriptorImpl]

'containsKey' @ [121:29] ==> public open fun containsKey(p0: (RawSignature..RawSignature?)): Boolean defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'predefinedSignature' @ [121:41] ==> val predefinedSignature: RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'signatures' @ [123:27] ==> value-parameter signatures: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[ValueParameterDescriptorImpl]

'predefinedSignature' @ [123:38] ==> val predefinedSignature: RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'NO_ORIGIN' @ [123:82] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'computeDiagnosticToReport' @ [125:30] ==> private final fun computeDiagnosticToReport(classOrigin: JvmDeclarationOrigin, classInternalName: String, rawSignature: RawSignature, origins: Collection<JvmDeclarationOrigin>): BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'classOrigin' @ [125:56] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[ValueParameterDescriptorImpl]

'classInternalName' @ [125:69] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[ValueParameterDescriptorImpl]

'predefinedSignature' @ [125:88] ==> val predefinedSignature: RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'origins' @ [125:109] ==> val origins: List<(JvmDeclarationOrigin..JvmDeclarationOrigin?)> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'diagnostics' @ [126:13] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'report' @ [126:25] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CONFLICTING_INHERITED_JVM_DECLARATIONS' @ [126:42] ==> public final val CONFLICTING_INHERITED_JVM_DECLARATIONS: (DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [126:81] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: ConflictingJvmDeclarationsData): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [126:84] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'element' @ [126:95] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'diagnostic' @ [126:104] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingWithPredefinedSignatures[LocalVariableDescriptor]

'data' @ [126:115] ==> public final val data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'classOrigin' @ [135:26] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[ValueParameterDescriptorImpl]

'descriptor' @ [135:38] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'descriptor' @ [136:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'groupMembersDescriptorsBySignature' @ [138:34] ==> private final fun groupMembersDescriptorsBySignature(descriptor: ClassDescriptor): MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'descriptor' @ [138:69] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'component1' @ [139:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component1(): (RawSignature..RawSignature?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'component2' @ [139:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component2(): (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'signatures' @ [139:41] ==> value-parameter signatures: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[ValueParameterDescriptorImpl]

'entrySet' @ [139:52] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>..Set<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'origins' @ [140:28] ==> val origins: (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'origin' @ [141:21] ==> val origin: (JvmDeclarationOrigin..JvmDeclarationOrigin?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'originKind' @ [141:28] ==> public final val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'SYNTHETIC' @ [141:67] ==> enum entry SYNTHETIC defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'groupedBySignature' @ [142:21] ==> val groupedBySignature: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'putValue' @ [142:40] ==> public open fun putValue(@Nullable p0: RawSignature?, p1: (JvmDeclarationOrigin..JvmDeclarationOrigin?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'rawSignature' @ [142:49] ==> val rawSignature: (RawSignature..RawSignature?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'origin' @ [142:63] ==> val origin: (JvmDeclarationOrigin..JvmDeclarationOrigin?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'component1' @ [147:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component1(): (RawSignature..RawSignature?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'component2' @ [147:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component2(): (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'groupedBySignature' @ [147:41] ==> val groupedBySignature: MultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'entrySet' @ [147:60] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>..Set<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'origins' @ [148:17] ==> val origins: (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'size' @ [148:25] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'computeDiagnosticToReport' @ [150:30] ==> private final fun computeDiagnosticToReport(classOrigin: JvmDeclarationOrigin, classInternalName: String, rawSignature: RawSignature, origins: Collection<JvmDeclarationOrigin>): BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'classOrigin' @ [150:56] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[ValueParameterDescriptorImpl]

'classInternalName' @ [150:69] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[ValueParameterDescriptorImpl]

'rawSignature' @ [150:88] ==> val rawSignature: (RawSignature..RawSignature?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'origins' @ [150:102] ==> val origins: (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'when (diagnostic) {
                is ConflictingDeclarationError.AccidentalOverride -> {
                    diagnostics.report(ErrorsJvm.ACCIDENTAL_OVERRIDE.on(diagnostic.element, diagnostic.data))
                }
                is ConflictingDeclarationError.ConflictingInheritedJvmDeclarations -> {
                    diagnostics.report(ErrorsJvm.CONFLICTING_INHERITED_JVM_DECLARATIONS.on(diagnostic.element, diagnostic.data))
                }
            }' @ [152:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [152:19] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'diagnostics' @ [154:21] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'report' @ [154:33] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'ACCIDENTAL_OVERRIDE' @ [154:50] ==> public final val ACCIDENTAL_OVERRIDE: (DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [154:70] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: ConflictingJvmDeclarationsData): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [154:73] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'element' @ [154:84] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'diagnostic' @ [154:93] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'data' @ [154:104] ==> public final val data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'diagnostics' @ [157:21] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'report' @ [157:33] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CONFLICTING_INHERITED_JVM_DECLARATIONS' @ [157:50] ==> public final val CONFLICTING_INHERITED_JVM_DECLARATIONS: (DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (ConflictingJvmDeclarationsData..ConflictingJvmDeclarationsData?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [157:89] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: ConflictingJvmDeclarationsData): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [157:92] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'element' @ [157:103] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'diagnostic' @ [157:112] ==> val diagnostic: BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.reportClashingSignaturesInHierarchy[LocalVariableDescriptor]

'data' @ [157:123] ==> public final val data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[PropertyDescriptorImpl]

'ConflictingDeclarationError' @ [165:17] ==> private constructor ConflictingDeclarationError(element: PsiElement, data: ConflictingJvmDeclarationsData) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[ClassConstructorDescriptorImpl]

'element' @ [165:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.AccidentalOverride.<init>[ValueParameterDescriptorImpl]

'data' @ [165:54] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.AccidentalOverride.<init>[ValueParameterDescriptorImpl]

'ConflictingDeclarationError' @ [167:17] ==> private constructor ConflictingDeclarationError(element: PsiElement, data: ConflictingJvmDeclarationsData) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError[ClassConstructorDescriptorImpl]

'element' @ [167:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.ConflictingInheritedJvmDeclarations.<init>[ValueParameterDescriptorImpl]

'data' @ [167:54] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.ConflictingInheritedJvmDeclarations.<init>[ValueParameterDescriptorImpl]

'origins' @ [178:24] ==> value-parameter origins: Collection<JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'origin' @ [179:26] ==> val origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'descriptor' @ [179:33] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'member' @ [180:17] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'member' @ [180:35] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'containingDeclaration' @ [180:42] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classOrigin' @ [180:67] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'descriptor' @ [180:79] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'member' @ [180:93] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'kind' @ [180:100] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [180:108] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'ownNonFakeCount' @ [181:17] ==> var ownNonFakeCount: Int defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'ownNonFakeCount' @ [184:21] ==> var ownNonFakeCount: Int defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'member' @ [186:21] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'kind' @ [186:28] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [186:36] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'memberElement' @ [188:21] ==> var memberElement: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'origin' @ [188:37] ==> val origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'element' @ [188:44] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'descriptorToDeclaration' @ [188:79] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'member' @ [188:103] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'memberElement' @ [189:25] ==> var memberElement: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'member' @ [189:50] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'memberElement' @ [190:25] ==> var memberElement: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [190:41] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [190:65] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'member' @ [190:89] ==> val member: CallableMemberDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'correspondingProperty' @ [190:96] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'ConflictingJvmDeclarationsData' @ [196:20] ==> public constructor ConflictingJvmDeclarationsData(classInternalName: String, classOrigin: JvmDeclarationOrigin, signature: RawSignature, signatureOrigins: Collection<JvmDeclarationOrigin>) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedClassConstructorDescriptor]

'classInternalName' @ [196:51] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'classOrigin' @ [196:70] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'rawSignature' @ [196:83] ==> value-parameter rawSignature: RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'origins' @ [196:97] ==> value-parameter origins: Collection<JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'memberElement' @ [197:13] ==> var memberElement: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'AccidentalOverride' @ [198:48] ==> public constructor AccidentalOverride(element: PsiElement, data: ConflictingJvmDeclarationsData) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.AccidentalOverride[ClassConstructorDescriptorImpl]

'memberElement' @ [198:67] ==> var memberElement: PsiElement? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'data' @ [198:82] ==> val data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'classOrigin' @ [202:33] ==> value-parameter classOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[ValueParameterDescriptorImpl]

'element' @ [202:45] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'ConflictingInheritedJvmDeclarations' @ [204:44] ==> public constructor ConflictingInheritedJvmDeclarations(element: PsiElement, data: ConflictingJvmDeclarationsData) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.ConflictingDeclarationError.ConflictingInheritedJvmDeclarations[ClassConstructorDescriptorImpl]

'elementToReportOn' @ [204:80] ==> val elementToReportOn: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'data' @ [204:99] ==> val data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.computeDiagnosticToReport[LocalVariableDescriptor]

'create' @ [208:43] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(RawSignature..RawSignature?), (JvmDeclarationOrigin..JvmDeclarationOrigin?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> RawSignature
    <V : (Any..Any?)> -> JvmDeclarationOrigin

'member' @ [211:17] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'member' @ [213:17] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'visibility' @ [213:24] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [213:51] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isOrOverridesSamAdapter' @ [215:17] ==> private final fun isOrOverridesSamAdapter(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'member' @ [215:41] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'if (member is PropertyDescriptor) {
                processMember(member.getter)
                processMember(member.setter)
            }
            else if (member is FunctionDescriptor) {
                val signatures =
                        if (member.kind == FAKE_OVERRIDE)
                            member.overriddenTreeUniqueAsSequence(useOriginal = true)
                                    // drop the root (itself)
                                    .drop(1)
                                    .mapTo(HashSet()) { it.asRawSignature() }
                        else
                            setOf(member.asRawSignature())

                signatures.forEach {
                    rawSignature ->
                    groupedBySignature.putValue(rawSignature, OtherOrigin(member))
                }
            }' @ [217:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'member' @ [217:17] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'processMember' @ [218:17] ==> local final fun processMember(member: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[SimpleFunctionDescriptorImpl]

'member' @ [218:31] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'getter' @ [218:38] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'processMember' @ [219:17] ==> local final fun processMember(member: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[SimpleFunctionDescriptorImpl]

'member' @ [219:31] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'setter' @ [219:38] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'member' @ [221:22] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'if (member.kind == FAKE_OVERRIDE)
                            member.overriddenTreeUniqueAsSequence(useOriginal = true)
                                    // drop the root (itself)
                                    .drop(1)
                                    .mapTo(HashSet()) { it.asRawSignature() }
                        else
                            setOf(member.asRawSignature())' @ [223:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<RawSignature>, elseBranch: Set<RawSignature>): Set<RawSignature>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<RawSignature>

'member' @ [223:29] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'kind' @ [223:36] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [223:44] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'member' @ [224:29] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'overriddenTreeUniqueAsSequence' @ [224:36] ==> public fun <D : CallableDescriptor> FunctionDescriptor.overriddenTreeUniqueAsSequence(useOriginal: Boolean): Sequence<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'drop' @ [226:38] ==> public fun <T> Sequence<FunctionDescriptor>.drop(n: Int): Sequence<FunctionDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'mapTo' @ [227:38] ==> public inline fun <T, R, C : MutableCollection<in RawSignature>> Sequence<FunctionDescriptor>.mapTo(destination: HashSet<RawSignature>, transform: (FunctionDescriptor) -> RawSignature): HashSet<RawSignature> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> RawSignature
    <C : MutableCollection<in R>> -> HashSet<RawSignature>

'HashSet' @ [227:44] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> RawSignature

'it' @ [227:57] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember.<anonymous>[ValueParameterDescriptorImpl]

'asRawSignature' @ [227:60] ==> private final fun FunctionDescriptor.asRawSignature(): RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'setOf' @ [229:29] ==> public fun <T> setOf(element: RawSignature): Set<RawSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RawSignature

'member' @ [229:35] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'asRawSignature' @ [229:42] ==> private final fun FunctionDescriptor.asRawSignature(): RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'signatures' @ [231:17] ==> val signatures: Set<RawSignature> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[LocalVariableDescriptor]

'forEach' @ [231:28] ==> @HidesMembers public inline fun <T> Iterable<RawSignature>.forEach(action: (RawSignature) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RawSignature

'groupedBySignature' @ [233:21] ==> val groupedBySignature: MultiMap<(RawSignature..RawSignature?), (JvmDeclarationOrigin..JvmDeclarationOrigin?)> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[LocalVariableDescriptor]

'putValue' @ [233:40] ==> public open fun putValue(@Nullable p0: RawSignature?, p1: (JvmDeclarationOrigin..JvmDeclarationOrigin?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'rawSignature' @ [233:49] ==> value-parameter rawSignature: RawSignature defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember.<anonymous>[ValueParameterDescriptorImpl]

'OtherOrigin' @ [233:63] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'member' @ [233:75] ==> value-parameter member: DeclarationDescriptor? defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.processMember[ValueParameterDescriptorImpl]

'descriptor' @ [238:9] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[ValueParameterDescriptorImpl]

'defaultType' @ [238:20] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [238:32] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [238:44] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'forEach' @ [238:72] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'processMember' @ [238:82] ==> local final fun processMember(member: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [239:9] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[ValueParameterDescriptorImpl]

'getParentJavaStaticClassScope' @ [239:20] ==> public fun ClassDescriptor.getParentJavaStaticClassScope(): LazyJavaStaticClassScope? defined in org.jetbrains.kotlin.load.java.descriptors[DeserializedSimpleFunctionDescriptor]

'run' @ [239:53] ==> @InlineOnly public inline fun <T, R> LazyJavaStaticClassScope.run(block: LazyJavaStaticClassScope.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LazyJavaStaticClassScope
    <R> -> Unit

'getContributedDescriptors' @ [240:13] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[DeserializedSimpleFunctionDescriptor]

'FUNCTIONS' @ [240:60] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filter' @ [241:22] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [242:25] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isVisibleIgnoringReceiver' @ [242:66] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'it' @ [242:92] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [242:96] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[ValueParameterDescriptorImpl]

'forEach' @ [244:22] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'processMember' @ [244:32] ==> local final fun processMember(member: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[SimpleFunctionDescriptorImpl]

'groupedBySignature' @ [247:16] ==> val groupedBySignature: MultiMap<(RawSignature..RawSignature?), (JvmDeclarationOrigin..JvmDeclarationOrigin?)> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.groupMembersDescriptorsBySignature[LocalVariableDescriptor]

'with' @ [251:9] ==> @InlineOnly public inline fun <T, R> with(receiver: Method, block: (Method).() -> RawSignature): RawSignature defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Method
    <R> -> RawSignature

'typeMapper' @ [251:14] ==> private final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[PropertyDescriptorImpl]

'mapAsmMethod' @ [251:25] ==> @NotNull public open fun mapAsmMethod(@NotNull descriptor: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [251:38] ==> <this> defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.asRawSignature[ReceiverParameterDescriptorImpl]

'RawSignature' @ [252:13] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'name' @ [252:26] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'descriptor' @ [252:32] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'METHOD' @ [252:55] ==> enum entry METHOD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'descriptor' @ [256:13] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.isOrOverridesSamAdapter[ValueParameterDescriptorImpl]

'descriptor' @ [258:16] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.isOrOverridesSamAdapter[ValueParameterDescriptorImpl]

'kind' @ [258:27] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [258:65] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [259:20] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.isOrOverridesSamAdapter[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [259:31] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'all' @ [259:53] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.all(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'isOrOverridesSamAdapter' @ [259:59] ==> private final fun isOrOverridesSamAdapter(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics[SimpleFunctionDescriptorImpl]

'it' @ [259:83] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateSignatureDiagnostics.isOrOverridesSamAdapter.<anonymous>[ValueParameterDescriptorImpl]

