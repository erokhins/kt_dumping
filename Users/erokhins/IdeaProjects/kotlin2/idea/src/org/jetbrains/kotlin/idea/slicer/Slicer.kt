'invoke' @ [67:5] ==> public abstract operator fun KtDeclaration.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'HierarchySearchRequest' @ [68:5] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtDeclaration, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtDeclaration

'this' @ [68:28] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.processHierarchyDownward[ReceiverParameterDescriptorImpl]

'scope' @ [68:34] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.processHierarchyDownward[ValueParameterDescriptorImpl]

'searchOverriders' @ [68:41] ==> public fun HierarchySearchRequest<*>.searchOverriders(): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'forEach' @ [68:60] ==> @HidesMembers public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.forEach(action: ((PsiMethod..PsiMethod?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [69:10] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.slicer.processHierarchyDownward.<anonymous>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [69:13] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'invoke' @ [69:55] ==> public abstract operator fun KtDeclaration.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [74:5] ==> public abstract operator fun KtDeclaration.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'resolveToDescriptor' @ [75:22] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getAllOverriddenDescriptors' @ [77:14] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableMemberDescriptor

'descriptor' @ [77:42] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.slicer.processHierarchyUpward[LocalVariableDescriptor]

'mapNotNull' @ [78:14] ==> public inline fun <T, R : Any> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.mapNotNull(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> KtDeclaration?): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R : Any> -> KtDeclaration

'it' @ [78:27] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.slicer.processHierarchyUpward.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [78:30] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [78:37] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'filter' @ [79:14] ==> public inline fun <T> Iterable<KtDeclaration>.filter(predicate: (KtDeclaration) -> Boolean): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'scope' @ [79:23] ==> value-parameter scope: AnalysisScope defined in org.jetbrains.kotlin.idea.slicer.processHierarchyUpward[ValueParameterDescriptorImpl]

'contains' @ [79:29] ==> public open operator fun contains(@NotNull p0: PsiElement): Boolean defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'it' @ [79:38] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.processHierarchyUpward.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [80:14] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'processor' @ [80:22] ==> value-parameter processor: KtDeclaration.() -> Unit defined in org.jetbrains.kotlin.idea.slicer.processHierarchyUpward[ValueParameterDescriptorImpl]

'processAllExactUsages' @ [84:5] ==> public fun KtDeclaration.processAllExactUsages(options: () -> FindUsagesOptions, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.findUsages in file findUsageUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinFunctionFindUsagesOptions' @ [86:17] ==> public constructor KotlinFunctionFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[ClassConstructorDescriptorImpl]

'project' @ [86:49] ==> public final val KtFunction.project: Project[MyPropertyDescriptor]

'apply' @ [86:58] ==> @InlineOnly public inline fun <T> KotlinFunctionFindUsagesOptions.apply(block: KotlinFunctionFindUsagesOptions.() -> Unit): KotlinFunctionFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFunctionFindUsagesOptions

'isSearchForTextOccurrences' @ [87:21] ==> public final var isSearchForTextOccurrences: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'isSkipImportStatements' @ [88:21] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'searchScope' @ [89:21] ==> @NotNull public final var searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'scope' @ [89:35] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.processCalls[ValueParameterDescriptorImpl]

'intersectWith' @ [89:41] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'useScope' @ [89:55] ==> public final val KtFunction.useScope: SearchScope[MyPropertyDescriptor]

'processor' @ [92:13] ==> value-parameter processor: (UsageInfo) -> Unit defined in org.jetbrains.kotlin.idea.slicer.processCalls[ValueParameterDescriptorImpl]

'processAllExactUsages' @ [101:5] ==> public fun KtDeclaration.processAllExactUsages(options: () -> FindUsagesOptions, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.findUsages in file findUsageUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinPropertyFindUsagesOptions' @ [103:17] ==> public constructor KotlinPropertyFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[ClassConstructorDescriptorImpl]

'project' @ [103:49] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'apply' @ [103:58] ==> @InlineOnly public inline fun <T> KotlinPropertyFindUsagesOptions.apply(block: KotlinPropertyFindUsagesOptions.() -> Unit): KotlinPropertyFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPropertyFindUsagesOptions

'isReadAccess' @ [104:21] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'kind' @ [104:36] ==> value-parameter kind: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'Read' @ [104:51] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'kind' @ [104:59] ==> value-parameter kind: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'ReadWrite' @ [104:74] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'isWriteAccess' @ [105:21] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'kind' @ [105:37] ==> value-parameter kind: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'Write' @ [105:52] ==> enum entry Write defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'kind' @ [105:61] ==> value-parameter kind: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'ReadWrite' @ [105:76] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'isReadWriteAccess' @ [106:21] ==> public final var isReadWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[PropertyDescriptorImpl]

'kind' @ [106:41] ==> value-parameter kind: ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'ReadWrite' @ [106:56] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'isSearchForTextOccurrences' @ [107:21] ==> public final var isSearchForTextOccurrences: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'isSkipImportStatements' @ [108:21] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'searchScope' @ [109:21] ==> @NotNull public final var searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'scope' @ [109:35] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'intersectWith' @ [109:41] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'useScope' @ [109:55] ==> public final val KtDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'processor' @ [112:13] ==> value-parameter processor: (UsageInfo) -> Unit defined in org.jetbrains.kotlin.idea.slicer.processVariableAccesses[ValueParameterDescriptorImpl]

'!' @ [117:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLoopParameter' @ [117:14] ==> public final val KtParameter.isLoopParameter: Boolean[MyPropertyDescriptor]

'isVarArg' @ [117:33] ==> public final val KtParameter.isVarArg: Boolean[MyPropertyDescriptor]

'HashMap' @ [126:43] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Pseudocode

'element' @ [129:29] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get[ValueParameterDescriptorImpl]

'containingDeclarationForPseudocode' @ [129:37] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'computedPseudocodes' @ [130:20] ==> private final val computedPseudocodes: HashMap<KtElement, Pseudocode> defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache[PropertyDescriptorImpl]

'getOrPut' @ [130:40] ==> public inline fun <K, V> MutableMap<KtElement, Pseudocode>.getOrPut(key: KtElement, defaultValue: () -> Pseudocode): Pseudocode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> Pseudocode

'container' @ [130:49] ==> val container: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get[LocalVariableDescriptor]

'container' @ [131:17] ==> val container: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get[LocalVariableDescriptor]

'getContainingPseudocode' @ [131:27] ==> public fun KtDeclaration.getContainingPseudocode(context: BindingContext): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'container' @ [131:51] ==> val container: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get[LocalVariableDescriptor]

'analyzeFully' @ [131:61] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'apply' @ [131:78] ==> @InlineOnly public inline fun <T> Pseudocode.apply(block: Pseudocode.() -> Unit): Pseudocode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pseudocode

'computedPseudocodes' @ [131:86] ==> private final val computedPseudocodes: HashMap<KtElement, Pseudocode> defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache[PropertyDescriptorImpl]

'container' @ [131:106] ==> val container: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get[LocalVariableDescriptor]

'this' @ [131:119] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache.get.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'PseudocodeCache' @ [136:37] ==> public constructor PseudocodeCache() defined in org.jetbrains.kotlin.idea.slicer.Slicer.PseudocodeCache[ClassConstructorDescriptorImpl]

'parentUsage' @ [139:32] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.Slicer[PropertyDescriptorImpl]

'lambdaLevel' @ [139:44] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'processor' @ [142:9] ==> protected final val processor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.Slicer[PropertyDescriptorImpl]

'process' @ [142:19] ==> public abstract fun process(p0: (SliceUsage..SliceUsage?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'KotlinSliceUsage' @ [142:27] ==> public constructor KotlinSliceUsage(element: PsiElement, parent: SliceUsage, lambdaLevel: Int, forcedExpressionMode: Boolean) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[ClassConstructorDescriptorImpl]

'this' @ [142:44] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.Slicer.passToProcessor[ReceiverParameterDescriptorImpl]

'parentUsage' @ [142:50] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.Slicer[PropertyDescriptorImpl]

'lambdaLevel' @ [142:63] ==> value-parameter lambdaLevel: Int = ... defined in org.jetbrains.kotlin.idea.slicer.Slicer.passToProcessor[ValueParameterDescriptorImpl]

'forcedExpressionMode' @ [142:76] ==> value-parameter forcedExpressionMode: Boolean = ... defined in org.jetbrains.kotlin.idea.slicer.Slicer.passToProcessor[ValueParameterDescriptorImpl]

'Slicer' @ [152:5] ==> public constructor Slicer(element: KtExpression, processor: Processor<SliceUsage>, parentUsage: KotlinSliceUsage) defined in org.jetbrains.kotlin.idea.slicer.Slicer[ClassConstructorDescriptorImpl]

'element' @ [152:12] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.<init>[ValueParameterDescriptorImpl]

'processor' @ [152:21] ==> value-parameter processor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.<init>[ValueParameterDescriptorImpl]

'parentUsage' @ [152:32] ==> value-parameter parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.<init>[ValueParameterDescriptorImpl]

'processHierarchyDownward' @ [154:9] ==> private fun KtDeclaration.processHierarchyDownward(scope: SearchScope, processor: KtDeclaration.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [154:34] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'scope' @ [154:46] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [154:52] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'passToProcessor' @ [154:71] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [157:70] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [157:82] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'passToProcessor' @ [157:97] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'lambdaLevel' @ [157:113] ==> value-parameter lambdaLevel: Int = ... defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.passToProcessorAsValue[ValueParameterDescriptorImpl]

'processVariableAccesses' @ [160:9] ==> private fun KtDeclaration.processVariableAccesses(scope: SearchScope, kind: ReadWriteAccessDetector.Access, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'accessSearchScope' @ [160:33] ==> value-parameter accessSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processAssignments[ValueParameterDescriptorImpl]

'Write' @ [160:59] ==> enum entry Write defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'it' @ [161:33] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processAssignments.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [161:36] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'?:' @ [162:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'safeDeparenthesize' @ [162:33] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'refExpression' @ [162:52] ==> val refExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processAssignments.<anonymous>[LocalVariableDescriptor]

'getAssignmentByLHS' @ [162:67] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'right' @ [162:89] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'rhs' @ [163:13] ==> val rhs: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processAssignments.<anonymous>[LocalVariableDescriptor]

'passToProcessorAsValue' @ [163:17] ==> private final fun PsiElement.passToProcessorAsValue(lambdaLevel: Int = ...): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'forEachDescendantOfType' @ [168:9] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtBinaryExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'it' @ [169:17] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>[ValueParameterDescriptorImpl]

'operationToken' @ [169:20] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [169:47] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [170:23] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>[ValueParameterDescriptorImpl]

'left' @ [170:26] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'let' @ [170:32] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'safeDeparenthesize' @ [170:48] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [170:67] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [171:23] ==> value-parameter it: KtBinaryExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>[ValueParameterDescriptorImpl]

'right' @ [171:26] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'!' @ [172:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lhs' @ [172:18] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>[LocalVariableDescriptor]

'isBackingFieldReference' @ [172:22] ==> private final fun KtExpression.isBackingFieldReference(): Boolean defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'rhs' @ [173:13] ==> val rhs: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processBackingFieldAssignments.<anonymous>[LocalVariableDescriptor]

'passToProcessor' @ [173:17] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [178:29] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'scope' @ [178:41] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [178:47] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'if (isVar) analysisScope
        else {
            val containerScope = getStrictParentOfType<KtDeclaration>()?.let { LocalSearchScope(it) } ?: return
            analysisScope.intersectWith(containerScope)
        }' @ [179:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SearchScope, elseBranch: SearchScope): SearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SearchScope

'isVar' @ [179:37] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'analysisScope' @ [179:44] ==> val analysisScope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processPropertyAssignments[LocalVariableDescriptor]

'getStrictParentOfType' @ [181:34] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'let' @ [181:74] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> LocalSearchScope): LocalSearchScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> LocalSearchScope

'LocalSearchScope' @ [181:80] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'it' @ [181:97] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processPropertyAssignments.<anonymous>[ValueParameterDescriptorImpl]

'analysisScope' @ [182:13] ==> val analysisScope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processPropertyAssignments[LocalVariableDescriptor]

'intersectWith' @ [182:27] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'containerScope' @ [182:41] ==> val containerScope: LocalSearchScope defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processPropertyAssignments[LocalVariableDescriptor]

'processAssignments' @ [184:9] ==> private final fun KtDeclaration.processAssignments(accessSearchScope: SearchScope): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'accessSearchScope' @ [184:28] ==> val accessSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processPropertyAssignments[LocalVariableDescriptor]

'getValue' @ [188:31] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'analyzeFully' @ [188:38] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'hasDelegateExpression' @ [190:13] ==> public open fun hasDelegateExpression(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'resolveToDescriptor' @ [191:27] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getter' @ [191:85] ==> public abstract val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'getter' @ [192:46] ==> val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty[LocalVariableDescriptor]

'let' @ [192:54] ==> @InlineOnly public inline fun <T, R> VariableAccessorDescriptor.let(block: (VariableAccessorDescriptor) -> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableAccessorDescriptor
    <R> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?

'bindingContext' @ [192:60] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty[LocalVariableDescriptor]

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [192:90] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [192:124] ==> value-parameter it: VariableAccessorDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty.<anonymous>[ValueParameterDescriptorImpl]

'delegateGetterResolvedCall' @ [193:14] ==> val delegateGetterResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty[LocalVariableDescriptor]

'resultingDescriptor' @ [193:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'source' @ [193:63] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [193:71] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'passToProcessor' @ [193:108] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'initializer' @ [197:9] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'passToProcessor' @ [197:22] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'getter' @ [199:9] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'processFunction' @ [199:17] ==> private final fun KtDeclarationWithBody.processFunction(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'getter' @ [201:31] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'bodyExpression' @ [201:39] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'setter' @ [202:31] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'bodyExpression' @ [202:39] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'isDefaultGetter' @ [203:13] ==> val isDefaultGetter: Boolean defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty[LocalVariableDescriptor]

'if (isDefaultSetter) {
                processPropertyAssignments()
            }
            else {
                setter!!.processBackingFieldAssignments()
            }' @ [204:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDefaultSetter' @ [204:17] ==> val isDefaultSetter: Boolean defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processProperty[LocalVariableDescriptor]

'processPropertyAssignments' @ [205:17] ==> private final fun KtProperty.processPropertyAssignments(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'setter' @ [208:17] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'processBackingFieldAssignments' @ [208:26] ==> private final fun KtPropertyAccessor.processBackingFieldAssignments(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'!' @ [214:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canProcess' @ [214:14] ==> private fun KtParameter.canProcess(): Boolean defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'ownerFunction' @ [216:24] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'function' @ [217:13] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'isOverridable' @ [217:22] ==> public fun KtDeclaration.isOverridable(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'function' @ [219:13] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'function' @ [219:47] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'isSetter' @ [219:56] ==> public final val KtPropertyAccessor.isSetter: Boolean[MyPropertyDescriptor]

'function' @ [220:13] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'property' @ [220:22] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'processPropertyAssignments' @ [220:31] ==> private final fun KtProperty.processPropertyAssignments(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'analyze' @ [224:35] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'VALUE_PARAMETER' @ [224:60] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [224:77] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[ReceiverParameterDescriptorImpl]

'function' @ [226:10] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'processCalls' @ [226:36] ==> private fun KtFunction.processCalls(scope: SearchScope, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [226:49] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'scope' @ [226:61] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [226:67] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'it' @ [227:33] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [227:36] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'refExpression' @ [228:31] ==> val refExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [228:45] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [228:87] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callElement' @ [229:32] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [229:44] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callElement' @ [229:60] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'analyze' @ [229:72] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [230:36] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [230:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'parameterDescriptor' @ [230:64] ==> val parameterDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter[LocalVariableDescriptor]

'when (resolvedArgument) {
                                      is DefaultValueArgument -> defaultValue
                                      is ExpressionValueArgument -> resolvedArgument.valueArgument?.getArgumentExpression()
                                      else -> null
                                  }' @ [231:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'resolvedArgument' @ [231:41] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'defaultValue' @ [232:66] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'resolvedArgument' @ [233:69] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [233:86] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'getArgumentExpression' @ [233:101] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'flownExpression' @ [236:13] ==> val flownExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processParameter.<anonymous>[LocalVariableDescriptor]

'passToProcessorAsValue' @ [236:29] ==> private final fun PsiElement.passToProcessorAsValue(lambdaLevel: Int = ...): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'valOrVarKeyword' @ [239:13] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'toValVar' @ [239:29] ==> public fun PsiElement?.toValVar(): KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'Var' @ [239:56] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'processAssignments' @ [240:13] ==> private final fun KtDeclaration.processAssignments(accessSearchScope: SearchScope): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [240:32] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'scope' @ [240:44] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [240:50] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'bodyExpression' @ [245:30] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'pseudocodeCache' @ [246:26] ==> protected final val pseudocodeCache: Slicer.PseudocodeCache defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'bodyExpression' @ [246:42] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction[LocalVariableDescriptor]

'pseudocode' @ [247:9] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction[LocalVariableDescriptor]

'traverse' @ [247:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'FORWARD' @ [247:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instr' @ [248:17] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction.<anonymous>[ValueParameterDescriptorImpl]

'instr' @ [248:52] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction.<anonymous>[ValueParameterDescriptorImpl]

'subroutine' @ [248:58] ==> public final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'this' @ [248:72] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction[ReceiverParameterDescriptorImpl]

'instr' @ [249:18] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction.<anonymous>[ValueParameterDescriptorImpl]

'returnExpressionIfAny' @ [249:24] ==> public final val returnExpressionIfAny: KtReturnExpression? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'returnedExpression' @ [249:47] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'instr' @ [249:69] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processFunction.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [249:75] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'passToProcessorAsValue' @ [249:102] ==> private final fun PsiElement.passToProcessorAsValue(lambdaLevel: Int = ...): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'inputValues' @ [255:9] ==> public abstract val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'forEach' @ [255:21] ==> @HidesMembers public inline fun <T> Iterable<PseudoValue>.forEach(action: (PseudoValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'it' @ [256:17] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.passInputsToProcessor.<anonymous>[ValueParameterDescriptorImpl]

'createdAt' @ [256:20] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'it' @ [257:17] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.passInputsToProcessor.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [257:20] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'passToProcessorAsValue' @ [257:29] ==> private final fun PsiElement.passToProcessorAsValue(lambdaLevel: Int = ...): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'this' @ [263:16] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.isBackingFieldReference[ReceiverParameterDescriptorImpl]

'getReferencedName' @ [264:16] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'NAME' @ [264:64] ==> @field:JvmField public final val NAME: Name defined in org.jetbrains.kotlin.descriptors.impl.SyntheticFieldDescriptor.Companion[DeserializedPropertyDescriptor]

'asString' @ [264:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'analyze' @ [265:16] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'REFERENCE_TARGET' @ [265:41] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [265:59] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.isBackingFieldReference[ReceiverParameterDescriptorImpl]

'when (this) {
            is KtLambdaExpression -> functionLiteral
            is KtNamedFunction -> if (name == null) this else null
            else -> null
        }' @ [269:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NavigatablePsiElement?, entry1: NavigatablePsiElement?, entry2: NavigatablePsiElement?): NavigatablePsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NavigatablePsiElement?

'this' @ [269:28] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[ReceiverParameterDescriptorImpl]

'functionLiteral' @ [270:38] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'if (name == null) this else null' @ [271:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNamedFunction?, elseBranch: KtNamedFunction?): KtNamedFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNamedFunction?

'name' @ [271:39] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'this' @ [271:53] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[ReceiverParameterDescriptorImpl]

'lambda' @ [274:13] ==> val lambda: NavigatablePsiElement? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'parentUsage' @ [275:17] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [275:29] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'lambda' @ [276:17] ==> val lambda: NavigatablePsiElement? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'passToProcessor' @ [276:24] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [276:40] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [276:52] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'pseudocodeCache' @ [281:26] ==> protected final val pseudocodeCache: Slicer.PseudocodeCache defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'this' @ [281:42] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[ReceiverParameterDescriptorImpl]

'pseudocode' @ [282:31] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'getElementValue' @ [282:42] ==> public abstract fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'this' @ [282:58] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[ReceiverParameterDescriptorImpl]

'expressionValue' @ [283:25] ==> val expressionValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'createdAt' @ [283:41] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'when (createdAt) {
            is ReadValueInstruction -> {
                if (createdAt.target == AccessTarget.BlackBox) {
                    val originalElement = expressionValue.element as? KtExpression ?: return
                    if (originalElement != this) {
                        originalElement.processExpression()
                    }
                    return
                }
                val accessedDescriptor = createdAt.target.accessedDescriptor ?: return
                val accessedDeclaration = accessedDescriptor.source.getPsi() as? KtDeclaration ?: return
                if (accessedDescriptor is SyntheticFieldDescriptor) {
                    val property = accessedDeclaration as? KtProperty ?: return
                    if (accessedDescriptor.propertyDescriptor.setter?.isDefault ?: true) {
                        property.processPropertyAssignments()
                    }
                    else {
                        property.setter?.processBackingFieldAssignments()
                    }
                    return
                }
                accessedDeclaration.processHierarchyDownwardAndPass()
            }

            is MergeInstruction -> createdAt.passInputsToProcessor()

            is MagicInstruction -> when (createdAt.kind) {
                MagicKind.NOT_NULL_ASSERTION, MagicKind.CAST -> createdAt.passInputsToProcessor()
                MagicKind.BOUND_CALLABLE_REFERENCE, MagicKind.UNBOUND_CALLABLE_REFERENCE -> {
                    val callableRefExpr = expressionValue.element as? KtCallableReferenceExpression ?: return
                    val referencedDescriptor = analyze()[BindingContext.REFERENCE_TARGET, callableRefExpr.callableReference] ?: return
                    val referencedDeclaration = (referencedDescriptor as? DeclarationDescriptorWithSource)?.source?.getPsi() ?: return
                    referencedDeclaration.passToProcessor(parentUsage.lambdaLevel - 1)
                }
                else -> return
            }

            is CallInstruction -> {
                val resolvedCall = createdAt.resolvedCall
                val resultingDescriptor = resolvedCall.resultingDescriptor
                if (resultingDescriptor is FunctionInvokeDescriptor) {
                    (resolvedCall.dispatchReceiver as? ExpressionReceiver)?.expression?.passToProcessorAsValue(parentUsage.lambdaLevel + 1)
                }
                else {
                    (resultingDescriptor.source.getPsi() as? KtDeclaration)?.processHierarchyDownwardAndPass()
                }
            }
        }' @ [284:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'createdAt' @ [284:15] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'createdAt' @ [286:21] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'target' @ [286:31] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[DeserializedPropertyDescriptor]

'BlackBox' @ [286:54] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'expressionValue' @ [287:43] ==> val expressionValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'element' @ [287:59] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'originalElement' @ [288:25] ==> val originalElement: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'this' @ [288:44] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[ReceiverParameterDescriptorImpl]

'originalElement' @ [289:25] ==> val originalElement: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'processExpression' @ [289:41] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'createdAt' @ [293:42] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'target' @ [293:52] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[DeserializedPropertyDescriptor]

'accessedDescriptor' @ [293:59] ==> public val AccessTarget.accessedDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval[DeserializedPropertyDescriptor]

'accessedDescriptor' @ [294:43] ==> val accessedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'source' @ [294:62] ==> public final val CallableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [294:69] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'accessedDescriptor' @ [295:21] ==> val accessedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'accessedDeclaration' @ [296:36] ==> val accessedDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'if (accessedDescriptor.propertyDescriptor.setter?.isDefault ?: true) {
                        property.processPropertyAssignments()
                    }
                    else {
                        property.setter?.processBackingFieldAssignments()
                    }' @ [297:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'accessedDescriptor' @ [297:25] ==> val accessedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'propertyDescriptor' @ [297:44] ==> public final val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SyntheticFieldDescriptor[DeserializedPropertyDescriptor]

'setter' @ [297:63] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [297:71] ==> public final val PropertySetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'property' @ [298:25] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'processPropertyAssignments' @ [298:34] ==> private final fun KtProperty.processPropertyAssignments(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'property' @ [301:25] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'setter' @ [301:34] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'processBackingFieldAssignments' @ [301:42] ==> private final fun KtPropertyAccessor.processBackingFieldAssignments(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'accessedDeclaration' @ [305:17] ==> val accessedDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'processHierarchyDownwardAndPass' @ [305:37] ==> private final fun KtDeclaration.processHierarchyDownwardAndPass(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'createdAt' @ [308:36] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'passInputsToProcessor' @ [308:46] ==> private final fun Instruction.passInputsToProcessor(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'when (createdAt.kind) {
                MagicKind.NOT_NULL_ASSERTION, MagicKind.CAST -> createdAt.passInputsToProcessor()
                MagicKind.BOUND_CALLABLE_REFERENCE, MagicKind.UNBOUND_CALLABLE_REFERENCE -> {
                    val callableRefExpr = expressionValue.element as? KtCallableReferenceExpression ?: return
                    val referencedDescriptor = analyze()[BindingContext.REFERENCE_TARGET, callableRefExpr.callableReference] ?: return
                    val referencedDeclaration = (referencedDescriptor as? DeclarationDescriptorWithSource)?.source?.getPsi() ?: return
                    referencedDeclaration.passToProcessor(parentUsage.lambdaLevel - 1)
                }
                else -> return
            }' @ [310:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'createdAt' @ [310:42] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'kind' @ [310:52] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[DeserializedPropertyDescriptor]

'NOT_NULL_ASSERTION' @ [311:27] ==> enum entry NOT_NULL_ASSERTION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'CAST' @ [311:57] ==> enum entry CAST defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'createdAt' @ [311:65] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'passInputsToProcessor' @ [311:75] ==> private final fun Instruction.passInputsToProcessor(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'BOUND_CALLABLE_REFERENCE' @ [312:27] ==> enum entry BOUND_CALLABLE_REFERENCE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'UNBOUND_CALLABLE_REFERENCE' @ [312:63] ==> enum entry UNBOUND_CALLABLE_REFERENCE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'expressionValue' @ [313:43] ==> val expressionValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'element' @ [313:59] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'analyze' @ [314:48] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'REFERENCE_TARGET' @ [314:73] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callableRefExpr' @ [314:91] ==> val callableRefExpr: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'callableReference' @ [314:107] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'?:' @ [315:49] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'referencedDescriptor' @ [315:50] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'source' @ [315:109] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [315:117] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'referencedDeclaration' @ [316:21] ==> val referencedDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'passToProcessor' @ [316:43] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [316:59] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [316:71] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'createdAt' @ [322:36] ==> val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'resolvedCall' @ [322:46] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[DeserializedPropertyDescriptor]

'resolvedCall' @ [323:43] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [323:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'if (resultingDescriptor is FunctionInvokeDescriptor) {
                    (resolvedCall.dispatchReceiver as? ExpressionReceiver)?.expression?.passToProcessorAsValue(parentUsage.lambdaLevel + 1)
                }
                else {
                    (resultingDescriptor.source.getPsi() as? KtDeclaration)?.processHierarchyDownwardAndPass()
                }' @ [324:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'resultingDescriptor' @ [324:21] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'resolvedCall' @ [325:22] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'dispatchReceiver' @ [325:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'expression' @ [325:77] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'passToProcessorAsValue' @ [325:89] ==> private final fun PsiElement.passToProcessorAsValue(lambdaLevel: Int = ...): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [325:112] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [325:124] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [328:22] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer.processExpression[LocalVariableDescriptor]

'source' @ [328:42] ==> public final val CallableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [328:49] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'processHierarchyDownwardAndPass' @ [328:78] ==> private final fun KtDeclaration.processHierarchyDownwardAndPass(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [335:13] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'forcedExpressionMode' @ [335:25] ==> public final val forcedExpressionMode: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'element' @ [335:54] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'processExpression' @ [335:62] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'when (element) {
            is KtProperty -> element.processProperty()
            is KtParameter -> element.processParameter()
            is KtDeclarationWithBody -> element.processFunction()
            else -> element.processExpression()
        }' @ [337:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [337:15] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'element' @ [338:30] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'processProperty' @ [338:38] ==> private final fun KtProperty.processProperty(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [339:31] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'processParameter' @ [339:39] ==> private final fun KtParameter.processParameter(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [340:41] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'processFunction' @ [340:49] ==> private final fun KtDeclarationWithBody.processFunction(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [341:21] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[PropertyDescriptorImpl]

'processExpression' @ [341:29] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.InflowSlicer[SimpleFunctionDescriptorImpl]

'Slicer' @ [350:5] ==> public constructor Slicer(element: KtExpression, processor: Processor<SliceUsage>, parentUsage: KotlinSliceUsage) defined in org.jetbrains.kotlin.idea.slicer.Slicer[ClassConstructorDescriptorImpl]

'element' @ [350:12] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.<init>[ValueParameterDescriptorImpl]

'processor' @ [350:21] ==> value-parameter processor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.<init>[ValueParameterDescriptorImpl]

'parentUsage' @ [350:32] ==> value-parameter parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.<init>[ValueParameterDescriptorImpl]

'processHierarchyUpward' @ [352:9] ==> private fun KtDeclaration.processHierarchyUpward(scope: AnalysisScope, processor: KtDeclaration.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [352:32] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'scope' @ [352:44] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'this' @ [353:17] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>[ReceiverParameterDescriptorImpl]

'!' @ [353:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canProcess' @ [353:41] ==> private fun KtParameter.canProcess(): Boolean defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [355:36] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'params' @ [355:48] ==> public final val params: (SliceAnalysisParams..SliceAnalysisParams?) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[JavaPropertyDescriptor]

'showInstanceDereferences' @ [355:55] ==> public final var showInstanceDereferences: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'processVariableAccesses' @ [356:13] ==> private fun KtDeclaration.processVariableAccesses(scope: SearchScope, kind: ReadWriteAccessDetector.Access, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [356:37] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'scope' @ [356:49] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [356:55] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'if (withDereferences) Access.ReadWrite else Access.Read' @ [356:72] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReadWriteAccessDetector.Access, elseBranch: ReadWriteAccessDetector.Access): ReadWriteAccessDetector.Access[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Access

'withDereferences' @ [356:76] ==> val withDereferences: Boolean defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>[LocalVariableDescriptor]

'ReadWrite' @ [356:101] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'Read' @ [356:123] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'?:' @ [357:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'it' @ [357:38] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [357:41] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'let' @ [357:68] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'safeDeparenthesize' @ [357:84] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [357:103] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withDereferences' @ [358:21] ==> val withDereferences: Boolean defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>[LocalVariableDescriptor]

'refExpression' @ [359:21] ==> val refExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'processDereferences' @ [359:35] ==> private final fun KtExpression.processDereferences(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'!' @ [361:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'withDereferences' @ [361:22] ==> val withDereferences: Boolean defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>[LocalVariableDescriptor]

'KotlinReadWriteAccessDetector' @ [361:42] ==> public companion object defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[FakeCallableDescriptorForObject]

'INSTANCE' @ [361:72] ==> public final val INSTANCE: KotlinReadWriteAccessDetector defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.Companion[DeserializedPropertyDescriptor]

'getExpressionAccess' @ [361:81] ==> public open fun getExpressionAccess(expression: PsiElement): ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[DeserializedSimpleFunctionDescriptor]

'refExpression' @ [361:101] ==> val refExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Read' @ [361:126] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'refExpression' @ [362:21] ==> val refExpression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processVariable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'processExpression' @ [362:35] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'this' @ [369:13] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[ReceiverParameterDescriptorImpl]

'this' @ [369:53] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[ReceiverParameterDescriptorImpl]

'getNonStrictParentOfType' @ [371:32] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtOperationReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtOperationReferenceExpression

'operationRefExpr' @ [372:13] ==> val operationRefExpr: KtOperationReferenceExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'operationRefExpr' @ [372:46] ==> val operationRefExpr: KtOperationReferenceExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'parent' @ [372:63] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [374:26] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [374:68] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'parentCall' @ [375:22] ==> val parentCall: KtCallElement defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'calleeExpression' @ [375:33] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [375:51] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'safeDeparenthesize' @ [375:67] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [375:86] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee.<anonymous>[ValueParameterDescriptorImpl]

'callee' @ [376:13] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'this' @ [376:23] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[ReceiverParameterDescriptorImpl]

'callee' @ [376:31] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'callee' @ [376:74] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'isAncestor' @ [376:81] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [376:92] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[ReceiverParameterDescriptorImpl]

'parentCall' @ [376:112] ==> val parentCall: KtCallElement defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallElementForExactCallee[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [381:27] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [381:85] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'safeDeparenthesize' @ [382:32] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'callableRef' @ [382:51] ==> val callableRef: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallableReferenceForExactCallee[LocalVariableDescriptor]

'callableReference' @ [382:63] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'if (callee == this) callableRef else null' @ [383:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCallableReferenceExpression?, elseBranch: KtCallableReferenceExpression?): KtCallableReferenceExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCallableReferenceExpression?

'callee' @ [383:20] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallableReferenceForExactCallee[LocalVariableDescriptor]

'this' @ [383:30] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallableReferenceForExactCallee[ReceiverParameterDescriptorImpl]

'callableRef' @ [383:36] ==> val callableRef: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.getCallableReferenceForExactCallee[LocalVariableDescriptor]

'this' @ [387:13] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction[ReceiverParameterDescriptorImpl]

'this' @ [387:41] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction[ReceiverParameterDescriptorImpl]

'name' @ [387:68] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'processHierarchyUpward' @ [388:13] ==> private fun KtDeclaration.processHierarchyUpward(scope: AnalysisScope, processor: KtDeclaration.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [388:36] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'scope' @ [388:48] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'this' @ [389:18] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction.<anonymous>[ReceiverParameterDescriptorImpl]

'processCalls' @ [389:40] ==> private fun KtFunction.processCalls(scope: SearchScope, processor: (UsageInfo) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer in file Slicer.kt[SimpleFunctionDescriptorImpl]

'parentUsage' @ [389:53] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'scope' @ [389:65] ==> public final val KotlinSliceUsage.scope: AnalysisScope[MyPropertyDescriptor]

'toSearchScope' @ [389:71] ==> @NotNull public open fun toSearchScope(): SearchScope defined in com.intellij.analysis.AnalysisScope[JavaMethodDescriptor]

'it' @ [390:21] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [390:24] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'getCallElementForExactCallee' @ [390:33] ==> private final fun PsiElement.getCallElementForExactCallee(): KtElement? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'passToProcessor' @ [390:65] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'it' @ [391:21] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [391:24] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'getCallableReferenceForExactCallee' @ [391:33] ==> private final fun PsiElement.getCallableReferenceForExactCallee(): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'passToProcessor' @ [391:71] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [391:87] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [391:99] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'when (this) {
                                is KtFunctionLiteral -> parent as? KtLambdaExpression
                                is KtNamedFunction -> this
                                else -> null
                            }' @ [397:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'this' @ [397:35] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction[ReceiverParameterDescriptorImpl]

'parent' @ [398:57] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [399:55] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction[ReceiverParameterDescriptorImpl]

'funExpression' @ [402:10] ==> val funExpression: Any defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processFunction[LocalVariableDescriptor]

'passToProcessor' @ [402:39] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [402:55] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [402:67] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'!' @ [410:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parentUsage' @ [410:14] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'params' @ [410:26] ==> public final val params: (SliceAnalysisParams..SliceAnalysisParams?) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[JavaPropertyDescriptor]

'showInstanceDereferences' @ [410:33] ==> public final var showInstanceDereferences: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'instr' @ [412:24] ==> value-parameter instr: InstructionWithReceivers defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'receiverValues' @ [412:30] ==> public abstract val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithReceivers[DeserializedPropertyDescriptor]

'pseudoValue' @ [412:45] ==> value-parameter pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'when (instr) {
                               is CallInstruction -> instr.resolvedCall
                               is ReadValueInstruction -> (instr.target as? AccessTarget.Call)?.resolvedCall
                               else -> null
                           }' @ [413:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedCall<*>?, entry1: ResolvedCall<*>?, entry2: ResolvedCall<*>?): ResolvedCall<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedCall<*>?

'instr' @ [413:34] ==> value-parameter instr: InstructionWithReceivers defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'instr' @ [414:54] ==> value-parameter instr: InstructionWithReceivers defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'resolvedCall' @ [414:60] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[DeserializedPropertyDescriptor]

'instr' @ [415:60] ==> value-parameter instr: InstructionWithReceivers defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'target' @ [415:66] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[DeserializedPropertyDescriptor]

'resolvedCall' @ [415:97] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[DeserializedPropertyDescriptor]

'receiver' @ [419:13] ==> val receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[LocalVariableDescriptor]

'resolvedCall' @ [419:33] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[LocalVariableDescriptor]

'dispatchReceiver' @ [419:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'receiver' @ [419:66] ==> val receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[LocalVariableDescriptor]

'processor' @ [420:13] ==> protected final val processor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'process' @ [420:23] ==> public abstract fun process(p0: (SliceUsage..SliceUsage?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'KotlinSliceDereferenceUsage' @ [420:31] ==> public constructor KotlinSliceDereferenceUsage(element: PsiElement, parent: KotlinSliceUsage, lambdaLevel: Int) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceDereferenceUsage[ClassConstructorDescriptorImpl]

'expression' @ [420:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferenceIsNeeded[ValueParameterDescriptorImpl]

'parentUsage' @ [420:71] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'parentUsage' @ [420:84] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [420:96] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'pseudocodeCache' @ [425:26] ==> protected final val pseudocodeCache: Slicer.PseudocodeCache defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'this' @ [425:42] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[ReceiverParameterDescriptorImpl]

'pseudocode' @ [426:27] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[LocalVariableDescriptor]

'getElementValue' @ [426:38] ==> public abstract fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'this' @ [426:54] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[ReceiverParameterDescriptorImpl]

'pseudocode' @ [427:9] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[LocalVariableDescriptor]

'getUsages' @ [427:20] ==> public abstract fun getUsages(value: PseudoValue?): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'pseudoValue' @ [427:30] ==> val pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[LocalVariableDescriptor]

'forEach' @ [427:43] ==> @HidesMembers public inline fun <T> Iterable<Instruction>.forEach(action: (Instruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'invoke' @ [427:53] ==> public abstract operator fun invoke(p1: PseudoValue, p2: Instruction): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'pseudoValue' @ [427:63] ==> val pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages[LocalVariableDescriptor]

'it' @ [427:76] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processPseudocodeUsages.<anonymous>[ValueParameterDescriptorImpl]

'processPseudocodeUsages' @ [431:9] ==> private final fun KtExpression.processPseudocodeUsages(processor: (PseudoValue, Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'when (instr) {
                is ReadValueInstruction -> processDereferenceIsNeeded(this, pseudoValue, instr)
                is CallInstruction -> processDereferenceIsNeeded(this, pseudoValue, instr)
            }' @ [432:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'instr' @ [432:19] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences.<anonymous>[ValueParameterDescriptorImpl]

'processDereferenceIsNeeded' @ [433:44] ==> private final fun processDereferenceIsNeeded(expression: KtExpression, pseudoValue: PseudoValue, instr: InstructionWithReceivers): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'this' @ [433:71] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences[ReceiverParameterDescriptorImpl]

'pseudoValue' @ [433:77] ==> value-parameter pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences.<anonymous>[ValueParameterDescriptorImpl]

'instr' @ [433:90] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences.<anonymous>[ValueParameterDescriptorImpl]

'processDereferenceIsNeeded' @ [434:39] ==> private final fun processDereferenceIsNeeded(expression: KtExpression, pseudoValue: PseudoValue, instr: InstructionWithReceivers): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'this' @ [434:66] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences[ReceiverParameterDescriptorImpl]

'pseudoValue' @ [434:72] ==> value-parameter pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences.<anonymous>[ValueParameterDescriptorImpl]

'instr' @ [434:85] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processDereferences.<anonymous>[ValueParameterDescriptorImpl]

'processPseudocodeUsages' @ [440:9] ==> private final fun KtExpression.processPseudocodeUsages(processor: (PseudoValue, Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'when (instr) {
                is WriteValueInstruction -> (instr.target.accessedDescriptor?.source?.getPsi() as? KtDeclaration)?.passToProcessor()
                is CallInstruction -> {
                    if (parentUsage.lambdaLevel > 0 && instr.receiverValues[pseudoValue] != null) {
                        instr.element.passToProcessor(parentUsage.lambdaLevel - 1)
                    }
                    else {
                        instr.arguments[pseudoValue]?.source?.getPsi()?.passToProcessor()
                    }
                }
                is ReturnValueInstruction -> instr.subroutine.passToProcessor()
                is MagicInstruction -> when (instr.kind) {
                    MagicKind.NOT_NULL_ASSERTION, MagicKind.CAST -> instr.outputValue.element?.passToProcessor()
                    else -> { }
                }
            }' @ [441:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'instr' @ [441:19] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'instr' @ [442:46] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [442:52] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[DeserializedPropertyDescriptor]

'accessedDescriptor' @ [442:59] ==> public val AccessTarget.accessedDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval[DeserializedPropertyDescriptor]

'source' @ [442:79] ==> public final val CallableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [442:87] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'passToProcessor' @ [442:116] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'if (parentUsage.lambdaLevel > 0 && instr.receiverValues[pseudoValue] != null) {
                        instr.element.passToProcessor(parentUsage.lambdaLevel - 1)
                    }
                    else {
                        instr.arguments[pseudoValue]?.source?.getPsi()?.passToProcessor()
                    }' @ [444:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'parentUsage' @ [444:25] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [444:37] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'instr' @ [444:56] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'receiverValues' @ [444:62] ==> public open val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[DeserializedPropertyDescriptor]

'pseudoValue' @ [444:77] ==> value-parameter pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'instr' @ [445:25] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [445:31] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[DeserializedPropertyDescriptor]

'passToProcessor' @ [445:39] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [445:55] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'lambdaLevel' @ [445:67] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'instr' @ [448:25] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [448:31] ==> public final val arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[DeserializedPropertyDescriptor]

'pseudoValue' @ [448:41] ==> value-parameter pseudoValue: PseudoValue defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [448:55] ==> public final val ValueParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [448:63] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'passToProcessor' @ [448:73] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'instr' @ [451:46] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'subroutine' @ [451:52] ==> public final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'passToProcessor' @ [451:63] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'when (instr.kind) {
                    MagicKind.NOT_NULL_ASSERTION, MagicKind.CAST -> instr.outputValue.element?.passToProcessor()
                    else -> { }
                }' @ [452:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'instr' @ [452:46] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [452:52] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[DeserializedPropertyDescriptor]

'NOT_NULL_ASSERTION' @ [453:31] ==> enum entry NOT_NULL_ASSERTION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'CAST' @ [453:61] ==> enum entry CAST defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'instr' @ [453:69] ==> value-parameter instr: Instruction defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer.processExpression.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [453:75] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[DeserializedPropertyDescriptor]

'element' @ [453:87] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'passToProcessor' @ [453:96] ==> protected final fun PsiElement.passToProcessor(lambdaLevel: Int, forcedExpressionMode: Boolean): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'parentUsage' @ [461:13] ==> protected final val parentUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'forcedExpressionMode' @ [461:25] ==> public final val forcedExpressionMode: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[PropertyDescriptorImpl]

'element' @ [461:54] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'processExpression' @ [461:62] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'when (element) {
            is KtProperty, is KtParameter -> (element as KtDeclaration).processVariable()
            is KtFunction -> element.processFunction()
            is KtPropertyAccessor -> if (element.isGetter) {
                element.property.processVariable()
            }
            else -> element.processExpression()
        }' @ [463:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [463:15] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'element' @ [464:47] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'processVariable' @ [464:73] ==> private final fun KtDeclaration.processVariable(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [465:30] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'processFunction' @ [465:38] ==> private final fun KtFunction.processFunction(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [466:42] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'isGetter' @ [466:50] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'element' @ [467:17] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'property' @ [467:25] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'processVariable' @ [467:34] ==> private final fun KtDeclaration.processVariable(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

'element' @ [469:21] ==> protected final val element: KtExpression defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[PropertyDescriptorImpl]

'processExpression' @ [469:29] ==> private final fun KtExpression.processExpression(): Unit defined in org.jetbrains.kotlin.idea.slicer.OutflowSlicer[SimpleFunctionDescriptorImpl]

