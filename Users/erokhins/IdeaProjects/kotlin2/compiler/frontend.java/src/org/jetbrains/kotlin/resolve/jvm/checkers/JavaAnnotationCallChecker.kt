'resolvedCall' @ [39:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [39:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'original' @ [39:68] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'resultingDescriptor' @ [40:13] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[LocalVariableDescriptor]

'resultingDescriptor' @ [41:13] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[LocalVariableDescriptor]

'containingDeclaration' @ [41:33] ==> public final val JavaClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'kind' @ [41:55] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [41:73] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'reportErrorsOnPositionedArguments' @ [43:9] ==> private final fun reportErrorsOnPositionedArguments(resolvedCall: ResolvedCall<*>, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [43:43] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [43:57] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[ValueParameterDescriptorImpl]

'reportDeprecatedJavaAnnotation' @ [44:9] ==> private final fun reportDeprecatedJavaAnnotation(resolvedCall: ResolvedCall<*>, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [44:40] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [44:54] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [48:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[ValueParameterDescriptorImpl]

'call' @ [48:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [48:49] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'context' @ [49:20] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[ValueParameterDescriptorImpl]

'trace' @ [49:28] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'get' @ [49:34] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), p1: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [49:53] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotationEntry' @ [49:59] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[LocalVariableDescriptor]

'typeReference' @ [49:75] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'JavaAnnotationMapper' @ [50:9] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components[FakeCallableDescriptorForObject]

'javaToKotlinNameMap' @ [50:30] ==> public final val javaToKotlinNameMap: Map<FqName, FqName> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[DeserializedPropertyDescriptor]

'type' @ [50:50] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[LocalVariableDescriptor]

'constructor' @ [50:55] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [50:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [50:90] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> FqName

'getFqNameSafe' @ [50:112] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [50:126] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [50:134] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Unit

'context' @ [51:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[ValueParameterDescriptorImpl]

'trace' @ [51:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [51:27] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DEPRECATED_JAVA_ANNOTATION' @ [51:44] ==> public final val DEPRECATED_JAVA_ANNOTATION: (DiagnosticFactory1<(KtAnnotationEntry..KtAnnotationEntry?), (FqName..FqName?)>..DiagnosticFactory1<(KtAnnotationEntry..KtAnnotationEntry?), (FqName..FqName?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [51:71] ==> @NotNull public open fun on(@NotNull p0: KtAnnotationEntry, @NotNull p1: FqName): ParametrizedDiagnostic<(KtAnnotationEntry..KtAnnotationEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotationEntry' @ [51:74] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation[LocalVariableDescriptor]

'it' @ [51:91] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportDeprecatedJavaAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'getJavaAnnotationCallValueArgumentsThatShouldBeNamed' @ [56:9] ==> public final fun getJavaAnnotationCallValueArgumentsThatShouldBeNamed(resolvedCall: ResolvedCall<*>): Map<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [56:62] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportErrorsOnPositionedArguments[ValueParameterDescriptorImpl]

'forEach' @ [56:76] ==> @HidesMembers public inline fun <K, V> Map<out ValueParameterDescriptor, ResolvedValueArgument>.forEach(action: (Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedValueArgument

'reportOnValueArgument' @ [57:13] ==> private final fun reportOnValueArgument(context: CallCheckerContext, arguments: Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>, diagnostic: DiagnosticFactory0<KtExpression>): Unit defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker[SimpleFunctionDescriptorImpl]

'context' @ [57:35] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportErrorsOnPositionedArguments[ValueParameterDescriptorImpl]

'it' @ [57:44] ==> value-parameter it: Map.Entry<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportErrorsOnPositionedArguments.<anonymous>[ValueParameterDescriptorImpl]

'POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION' @ [57:58] ==> public final val POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'arguments' @ [66:31] ==> value-parameter arguments: Map.Entry<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportOnValueArgument[ValueParameterDescriptorImpl]

'value' @ [66:41] ==> public abstract val value: ResolvedValueArgument defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'arguments' @ [66:47] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'valueArgument' @ [67:38] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportOnValueArgument[LocalVariableDescriptor]

'getArgumentExpression' @ [67:52] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'context' @ [68:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportOnValueArgument[ValueParameterDescriptorImpl]

'trace' @ [68:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [68:27] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [68:34] ==> value-parameter diagnostic: DiagnosticFactory0<KtExpression> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportOnValueArgument[ValueParameterDescriptorImpl]

'on' @ [68:45] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'argumentExpression' @ [68:48] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.reportOnValueArgument[LocalVariableDescriptor]

'resolvedCall' @ [76:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion.getJavaAnnotationCallValueArgumentsThatShouldBeNamed[ValueParameterDescriptorImpl]

'valueArguments' @ [76:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'filter' @ [76:45] ==> public inline fun <K, V> Map<out ValueParameterDescriptor, (ResolvedValueArgument..ResolvedValueArgument?)>.filter(predicate: (Map.Entry<ValueParameterDescriptor, (ResolvedValueArgument..ResolvedValueArgument?)>) -> Boolean): Map<ValueParameterDescriptor, (ResolvedValueArgument..ResolvedValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'p' @ [78:21] ==> value-parameter p: Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion.getJavaAnnotationCallValueArgumentsThatShouldBeNamed.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [78:23] ==> public abstract val key: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'name' @ [78:27] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'DEFAULT_ANNOTATION_MEMBER_NAME' @ [78:54] ==> public final val DEFAULT_ANNOTATION_MEMBER_NAME: (Name..Name?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'p' @ [79:21] ==> value-parameter p: Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion.getJavaAnnotationCallValueArgumentsThatShouldBeNamed.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [79:23] ==> public abstract val value: (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'!' @ [80:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'?:' @ [80:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'p' @ [80:24] ==> value-parameter p: Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion.getJavaAnnotationCallValueArgumentsThatShouldBeNamed.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [80:26] ==> public abstract val value: (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'valueArgument' @ [80:60] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'isNamed' @ [80:75] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

