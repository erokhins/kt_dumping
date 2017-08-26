'CreateParameterFromUsageFactory<KtValueArgument>' @ [33:53] ==> public constructor CreateParameterFromUsageFactory<E : KtElement>() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtValueArgument

'?:' @ [35:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtValueArgument?, right: KtValueArgument): KtValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtValueArgument

'getParentElementOfType' @ [35:37] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtValueArgument..KtValueArgument?)>..Class<(KtValueArgument..KtValueArgument?)>?)): KtValueArgument? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtValueArgument

'diagnostic' @ [35:60] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'KtValueArgument' @ [35:72] ==> public constructor KtValueArgument(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaClassConstructorDescriptor]

'java' @ [35:95] ==> public val <T> KClass<KtValueArgument>.java: Class<KtValueArgument> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgument

'if (argument.isNamed()) argument else null' @ [36:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtValueArgument?, elseBranch: KtValueArgument?): KtValueArgument?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtValueArgument?

'argument' @ [36:20] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.getElementOfInterest[LocalVariableDescriptor]

'isNamed' @ [36:29] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [36:40] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.getElementOfInterest[LocalVariableDescriptor]

'?:' @ [40:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: AnalysisResult?, right: AnalysisResult): AnalysisResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> AnalysisResult

'diagnostic' @ [40:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'psiFile' @ [40:34] ==> public final val Diagnostic.psiFile: PsiFile[MyPropertyDescriptor]

'analyzeFullyAndGetResult' @ [40:55] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'result' @ [41:23] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'bindingContext' @ [41:30] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'element' @ [43:20] ==> value-parameter element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getArgumentName' @ [43:28] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'text' @ [43:47] ==> public final val KtValueArgumentName.text: (String..String?)[MyPropertyDescriptor]

'element' @ [44:34] ==> value-parameter element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [44:42] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'element' @ [46:27] ==> value-parameter element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [46:35] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'callElement' @ [47:34] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'getResolvedCall' @ [47:46] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [47:62] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'resultingDescriptor' @ [47:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'DescriptorToSourceUtilsIde' @ [48:24] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [48:51] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'callElement' @ [48:69] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'project' @ [48:81] ==> public final val KtCallElement.project: Project[MyPropertyDescriptor]

'functionDescriptor' @ [48:90] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callable' @ [49:16] ==> val callable: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'callable' @ [49:42] ==> val callable: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'callable' @ [49:66] ==> val callable: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'canRefactor' @ [49:75] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [51:23] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'builtIns' @ [51:42] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'anyType' @ [51:51] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'argumentExpression' @ [52:25] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'guessTypes' @ [52:45] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'context' @ [52:56] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'result' @ [52:65] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'moduleDescriptor' @ [52:72] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'let' @ [52:91] ==> @InlineOnly public inline fun <T, R> Array<KotlinType>.let(block: (Array<KotlinType>) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<KotlinType>
    <R> -> KotlinType

'when (it.size) {
                0 -> anyType
                1 -> it.first()
                else -> return null
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'it' @ [53:19] ==> value-parameter it: Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [53:22] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'anyType' @ [54:22] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'it' @ [55:22] ==> value-parameter it: Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [55:25] ==> public fun <T> Array<out KotlinType>.first(): KotlinType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'anyType' @ [58:14] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'paramType' @ [59:13] ==> val paramType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'hasTypeParametersToAdd' @ [59:23] ==> public fun KotlinType.hasTypeParametersToAdd(functionDescriptor: FunctionDescriptor, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable in file CreateParameterByRefActionFactory.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [59:46] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'context' @ [59:66] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'KotlinParameterInfo' @ [61:29] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'functionDescriptor' @ [62:38] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'name' @ [63:24] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'KotlinTypeInfo' @ [64:36] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'paramType' @ [64:58] ==> val paramType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'argumentExpression' @ [65:39] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'CreateParameterData' @ [68:16] ==> public constructor CreateParameterData<out E : KtElement>(parameterInfo: KotlinParameterInfo, originalExpression: KtValueArgument, createSilently: Boolean = ..., onComplete: ((Editor?) -> Unit)? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[ClassConstructorDescriptorImpl]
Inferred types:
    <out E : KtElement> -> KtValueArgument

'parameterInfo' @ [68:36] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[LocalVariableDescriptor]

'element' @ [68:51] ==> value-parameter element: KtValueArgument defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByNamedArgumentActionFactory.extractFixData[ValueParameterDescriptorImpl]

