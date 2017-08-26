'CreateCallableMemberFromUsageFactory<KtConstructorDelegationCall>' @ [37:59] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtConstructorDelegationCall

'diagnostic' @ [39:16] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [39:27] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getStrictParentOfType' @ [39:38] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtConstructorDelegationCall? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtConstructorDelegationCall

'element' @ [43:32] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'calleeExpression' @ [43:40] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'element' @ [44:28] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [44:36] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'currentClass' @ [46:23] ==> val currentClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'project' @ [46:36] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'currentClass' @ [48:31] ==> val currentClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'resolveToDescriptor' @ [48:44] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (calleeExpression.isThis) {
            currentClass
        }
        else {
            val superClassDescriptor =
                    DescriptorUtils.getSuperclassDescriptors(classDescriptor).singleOrNull { it.kind == ClassKind.CLASS } ?: return null
            DescriptorToSourceUtilsIde.getAnyDeclaration(project, superClassDescriptor) ?: return null
        }' @ [50:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'calleeExpression' @ [50:31] ==> val calleeExpression: KtConstructorDelegationReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'isThis' @ [50:48] ==> public final val KtConstructorDelegationReferenceExpression.isThis: Boolean[MyPropertyDescriptor]

'currentClass' @ [51:13] ==> val currentClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'?:' @ [55:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getSuperclassDescriptors' @ [55:37] ==> @NotNull public open fun getSuperclassDescriptors(@NotNull p0: ClassDescriptor): (MutableList<(ClassDescriptor..ClassDescriptor?)>..List<(ClassDescriptor..ClassDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [55:62] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'singleOrNull' @ [55:79] ==> public inline fun <T> Iterable<(ClassDescriptor..ClassDescriptor?)>.singleOrNull(predicate: ((ClassDescriptor..ClassDescriptor?)) -> Boolean): ClassDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'it' @ [55:94] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [55:97] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [55:115] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'DescriptorToSourceUtilsIde' @ [56:13] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [56:40] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [56:58] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'superClassDescriptor' @ [56:67] ==> val superClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [58:15] ==> val targetClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'canRefactor' @ [58:27] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [58:45] ==> val targetClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'targetClass' @ [58:71] ==> val targetClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'classDescriptor' @ [60:23] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'builtIns' @ [60:39] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [60:48] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'element' @ [61:26] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'valueArguments' @ [61:34] ==> public final val KtConstructorDelegationCall.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'map' @ [61:49] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> ParameterInfo): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> ParameterInfo

'ParameterInfo' @ [62:13] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'it' @ [63:21] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [63:24] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'let' @ [63:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> TypeInfo

'TypeInfo' @ [63:55] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [63:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [63:77] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [63:95] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'anyType' @ [63:104] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [63:122] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [64:21] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [64:24] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [64:43] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'asString' @ [64:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'SecondaryConstructorInfo' @ [68:16] ==> public constructor SecondaryConstructorInfo(parameterInfos: List<ParameterInfo>, targetClass: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.SecondaryConstructorInfo[ClassConstructorDescriptorImpl]

'parameters' @ [68:41] ==> val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'targetClass' @ [68:53] ==> val targetClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateConstructorFromDelegationCallActionFactory.createCallableInfo[LocalVariableDescriptor]

