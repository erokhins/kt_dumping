'modificationStamp' @ [58:48] ==> private final fun modificationStamp(resolveElement: KtElement): Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[SimpleFunctionDescriptorImpl]

'resolveElement' @ [58:66] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.<init>[ValueParameterDescriptorImpl]

'modificationStamp' @ [60:53] ==> private final val modificationStamp: Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[PropertyDescriptorImpl]

'modificationStamp' @ [60:74] ==> private final fun modificationStamp(resolveElement: KtElement): Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[SimpleFunctionDescriptorImpl]

'resolveElement' @ [60:92] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.isUpToDate[ValueParameterDescriptorImpl]

'resolveElement' @ [63:24] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'containingFile' @ [63:39] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'when {
                // for non-physical file we don't get OUT_OF_CODE_BLOCK_MODIFICATION_COUNT increased and must reset
                // data on any modification of the file
                !file.isPhysical -> file.modificationStamp

                resolveElement is KtDeclaration && KotlinCodeBlockModificationListener.isBlockDeclaration(resolveElement) -> resolveElement.getModificationStamp()
                resolveElement is KtSuperTypeList -> resolveElement.modificationStamp
                else -> null
            }' @ [64:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Long?, entry1: Long?, entry2: Long?, entry3: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Long?

'!' @ [67:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [67:18] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[LocalVariableDescriptor]

'isPhysical' @ [67:23] ==> public final val PsiFile.isPhysical: Boolean[MyPropertyDescriptor]

'file' @ [67:37] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[LocalVariableDescriptor]

'modificationStamp' @ [67:42] ==> public final val PsiFile.modificationStamp: Long[MyPropertyDescriptor]

'resolveElement' @ [69:17] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'KotlinCodeBlockModificationListener' @ [69:52] ==> public companion object defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[FakeCallableDescriptorForObject]

'isBlockDeclaration' @ [69:88] ==> public final fun isBlockDeclaration(declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[SimpleFunctionDescriptorImpl]

'resolveElement' @ [69:107] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'resolveElement' @ [69:126] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'getModificationStamp' @ [69:141] ==> public fun KtElement.getModificationStamp(): Long defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'resolveElement' @ [70:17] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'resolveElement' @ [70:54] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve.modificationStamp[ValueParameterDescriptorImpl]

'modificationStamp' @ [70:69] ==> public final val KtSuperTypeList.modificationStamp: Long[MyPropertyDescriptor]

'getManager' @ [77:111] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [77:122] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'createCachedValue' @ [77:131] ==> @NotNull public abstract fun <T : (Any..Any?)> createCachedValue(@NotNull p0: CachedValueProvider<(MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)>, p1: Boolean): CachedValue<(MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)> defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtElement, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve>..kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtElement, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve>?)

'CachedValueProvider' @ [78:13] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)>?): CachedValueProvider<MutableMap<KtElement, ResolveElementCache.CachedFullResolve>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<KtElement, CachedFullResolve>

'create' @ [79:44] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)>..CachedValueProvider.Result<(MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtElement, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve>..kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtElement, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve>?)

'createConcurrentSoftValueMap' @ [79:65] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftValueMap(): ConcurrentMap<(KtElement..KtElement?), (ResolveElementCache.CachedFullResolve..ResolveElementCache.CachedFullResolve?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> CachedFullResolve

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [80:74] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'resolveSession' @ [81:51] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'exceptionTracker' @ [81:66] ==> public final val ResolveSession.exceptionTracker: ExceptionTracker[MyPropertyDescriptor]

'modificationStamp' @ [86:48] ==> private final fun modificationStamp(file: KtFile): Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[SimpleFunctionDescriptorImpl]

'file' @ [86:66] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve.<init>[ValueParameterDescriptorImpl]

'modificationStamp' @ [89:17] ==> private final val modificationStamp: Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[PropertyDescriptorImpl]

'modificationStamp' @ [89:38] ==> private final fun modificationStamp(file: KtFile): Long? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[SimpleFunctionDescriptorImpl]

'file' @ [89:56] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve.isUpToDate[ValueParameterDescriptorImpl]

'mode' @ [89:65] ==> public final val mode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[PropertyDescriptorImpl]

'doesNotLessThan' @ [89:70] ==> public final fun doesNotLessThan(other: BodyResolveMode): Boolean defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedSimpleFunctionDescriptor]

'newMode' @ [89:86] ==> value-parameter newMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve.isUpToDate[ValueParameterDescriptorImpl]

'if (!file.isPhysical) // for non-physical file we don't get MODIFICATION_COUNT increased and must reset data on any modification of the file
                file.modificationStamp
            else
                null' @ [92:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'!' @ [92:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [92:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve.modificationStamp[ValueParameterDescriptorImpl]

'isPhysical' @ [92:30] ==> public final val KtFile.isPhysical: Boolean[MyPropertyDescriptor]

'file' @ [93:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve.modificationStamp[ValueParameterDescriptorImpl]

'modificationStamp' @ [93:22] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'getManager' @ [100:33] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [100:44] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'createCachedValue' @ [100:53] ==> @NotNull public abstract fun <T : (Any..Any?)> createCachedValue(@NotNull p0: CachedValueProvider<(MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)>, p1: Boolean): CachedValue<(MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)> defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtExpression, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve>..kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtExpression, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve>?)

'CachedValueProvider' @ [101:21] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)>?): CachedValueProvider<MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<KtExpression, CachedPartialResolve>

'create' @ [102:52] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)>..CachedValueProvider.Result<(MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtExpression, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve>..kotlin.collections.MutableMap<org.jetbrains.kotlin.psi.KtExpression, org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve>?)

'createConcurrentSoftValueMap' @ [102:73] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftValueMap(): ConcurrentMap<(KtExpression..KtExpression?), (ResolveElementCache.CachedPartialResolve..ResolveElementCache.CachedPartialResolve?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> CachedPartialResolve

'MODIFICATION_COUNT' @ [103:82] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'resolveSession' @ [104:59] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'exceptionTracker' @ [104:74] ==> public final val ResolveSession.exceptionTracker: ExceptionTracker[MyPropertyDescriptor]

'getInstance' @ [111:88] ==> public open fun getInstance(): (KotlinProbablyNothingFunctionShortNameIndex..KotlinProbablyNothingFunctionShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinProbablyNothingFunctionShortNameIndex[JavaMethodDescriptor]

'getAllKeys' @ [111:102] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinProbablyNothingFunctionShortNameIndex[JavaMethodDescriptor]

'project' @ [111:113] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'getInstance' @ [112:88] ==> public open fun getInstance(): (KotlinProbablyNothingPropertyShortNameIndex..KotlinProbablyNothingPropertyShortNameIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinProbablyNothingPropertyShortNameIndex[JavaMethodDescriptor]

'getAllKeys' @ [112:102] ==> public open fun getAllKeys(p0: (Project..Project?)): (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinProbablyNothingPropertyShortNameIndex[JavaMethodDescriptor]

'project' @ [112:113] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'getElementsAdditionalResolve' @ [117:15] ==> public final fun getElementsAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'function' @ [117:44] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveFunctionBody[ValueParameterDescriptorImpl]

'FULL' @ [117:76] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'constructorAdditionalResolve' @ [120:16] ==> private final fun constructorAdditionalResolve(resolveSession: ResolveSession, klass: KtClassOrObject, file: KtFile, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [120:45] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'ktClass' @ [120:61] ==> value-parameter ktClass: KtClass defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolvePrimaryConstructorParametersDefaultValues[ValueParameterDescriptorImpl]

'ktClass' @ [120:70] ==> value-parameter ktClass: KtClass defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolvePrimaryConstructorParametersDefaultValues[ValueParameterDescriptorImpl]

'containingKtFile' @ [120:78] ==> public final val KtClass.containingKtFile: KtFile[MyPropertyDescriptor]

'NO_DIAGNOSTICS' @ [120:115] ==> public final val NO_DIAGNOSTICS: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.BindingTraceFilter.Companion[DeserializedPropertyDescriptor]

'bindingContext' @ [120:131] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'Deprecated' @ [123:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'getElementsAdditionalResolve' @ [125:16] ==> public final fun getElementsAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveElement' @ [125:45] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementAdditionalResolve[ValueParameterDescriptorImpl]

'listOf' @ [125:61] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'contextElement' @ [125:68] ==> value-parameter contextElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [125:85] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementAdditionalResolve[ValueParameterDescriptorImpl]

'contextElements' @ [129:13] ==> value-parameter contextElements: Collection<KtElement>? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'assert' @ [130:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bodyResolveMode' @ [130:20] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [130:55] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'fullResolveCache' @ [134:30] ==> private final val fullResolveCache: CachedValue<MutableMap<KtElement, ResolveElementCache.CachedFullResolve>> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'value' @ [134:47] ==> public final val <T : (Any..Any?)> CachedValue<MutableMap<KtElement, ResolveElementCache.CachedFullResolve>>.value: (MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<KtElement, CachedFullResolve>

'fullResolveMap' @ [135:33] ==> val fullResolveMap: (MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [135:48] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'cachedFullResolve' @ [136:13] ==> val cachedFullResolve: ResolveElementCache.CachedFullResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'if (cachedFullResolve.isUpToDate(resolveElement)) {
                return cachedFullResolve.bindingContext
            }
            else {
                fullResolveMap.remove(resolveElement) // remove outdated cache entry
            }' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolveElementCache.CachedFullResolve?, elseBranch: ResolveElementCache.CachedFullResolve?): ResolveElementCache.CachedFullResolve?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CachedFullResolve?

'cachedFullResolve' @ [137:17] ==> val cachedFullResolve: ResolveElementCache.CachedFullResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'isUpToDate' @ [137:35] ==> public final fun isUpToDate(resolveElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[SimpleFunctionDescriptorImpl]

'resolveElement' @ [137:46] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'cachedFullResolve' @ [138:24] ==> val cachedFullResolve: ResolveElementCache.CachedFullResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [138:42] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[PropertyDescriptorImpl]

'fullResolveMap' @ [141:17] ==> val fullResolveMap: (MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'remove' @ [141:32] ==> public abstract fun remove(key: KtElement): ResolveElementCache.CachedFullResolve? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'resolveElement' @ [141:39] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'when (bodyResolveMode) {
            BodyResolveMode.FULL -> {
                val bindingContext = performElementAdditionalResolve(resolveElement, null, BodyResolveMode.FULL).first
                fullResolveMap[resolveElement] = CachedFullResolve(bindingContext, resolveElement)
                return bindingContext
            }

            else -> {
                if (resolveElement !is KtDeclaration) {
                    return getElementsAdditionalResolve(resolveElement, null, BodyResolveMode.FULL)
                }

                val file = resolveElement.getContainingKtFile()
                val statementsToResolve = contextElements!!.map { PartialBodyResolveFilter.findStatementToResolve(it, resolveElement) }.distinct()
                val partialResolveMap = partialBodyResolveCache.value
                val cachedResults = statementsToResolve.map { partialResolveMap[it ?: resolveElement] }
                if (cachedResults.all { it != null && it.isUpToDate(file, bodyResolveMode) }) { // partial resolve is already cached for these statements
                    return CompositeBindingContext.create(cachedResults.map { it!!.bindingContext }.distinct())
                }

                val (bindingContext, statementFilter) = performElementAdditionalResolve(resolveElement, contextElements, bodyResolveMode)

                if (statementFilter == StatementFilter.NONE) { // partial resolve is not supported for the given declaration - full resolve performed instead
                    fullResolveMap[resolveElement] = CachedFullResolve(bindingContext, resolveElement)
                    return bindingContext
                }

                val resolveToCache = CachedPartialResolve(bindingContext, file, bodyResolveMode)

                for (statement in (statementFilter as PartialBodyResolveFilter).allStatementsToResolve) {
                    if (!partialResolveMap.containsKey(statement) && bindingContext[BindingContext.PROCESSED, statement] == true) {
                        partialResolveMap[statement] = resolveToCache
                    }
                }

                // we use the whole declaration key in the map to obtain resolve not inside any block (e.g. default parameter values)
                partialResolveMap[resolveElement] = resolveToCache

                return bindingContext
            }
        }' @ [145:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'bodyResolveMode' @ [145:15] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [146:29] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'performElementAdditionalResolve' @ [147:38] ==> private final fun performElementAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): Pair<BindingContext, StatementFilter> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveElement' @ [147:70] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [147:108] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'first' @ [147:114] ==> public final val first: BindingContext defined in kotlin.Pair[DeserializedPropertyDescriptor]

'fullResolveMap' @ [148:17] ==> val fullResolveMap: (MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [148:32] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'CachedFullResolve' @ [148:50] ==> public constructor CachedFullResolve(bindingContext: BindingContext, resolveElement: KtElement) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[ClassConstructorDescriptorImpl]

'bindingContext' @ [148:68] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [148:84] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'bindingContext' @ [149:24] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [153:21] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'getElementsAdditionalResolve' @ [154:28] ==> public final fun getElementsAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveElement' @ [154:57] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [154:95] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolveElement' @ [157:28] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'getContainingKtFile' @ [157:43] ==> @NotNull public abstract fun getContainingKtFile(): KtFile defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'contextElements' @ [158:43] ==> value-parameter contextElements: Collection<KtElement>? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'map' @ [158:61] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtExpression?

'PartialBodyResolveFilter' @ [158:67] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[FakeCallableDescriptorForObject]

'findStatementToResolve' @ [158:92] ==> public final fun findStatementToResolve(element: KtElement, declaration: KtDeclaration): KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [158:115] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'resolveElement' @ [158:119] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'distinct' @ [158:137] ==> public fun <T> Iterable<KtExpression?>.distinct(): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'partialBodyResolveCache' @ [159:41] ==> private final val partialBodyResolveCache: CachedValue<MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'value' @ [159:65] ==> public final val <T : (Any..Any?)> CachedValue<MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>>.value: (MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<KtExpression, CachedPartialResolve>

'statementsToResolve' @ [160:37] ==> val statementsToResolve: List<KtExpression?> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'map' @ [160:57] ==> public inline fun <T, R> Iterable<KtExpression?>.map(transform: (KtExpression?) -> ResolveElementCache.CachedPartialResolve?): List<ResolveElementCache.CachedPartialResolve?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?
    <R> -> CachedPartialResolve?

'partialResolveMap' @ [160:63] ==> val partialResolveMap: (MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'it' @ [160:81] ==> value-parameter it: KtExpression? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'resolveElement' @ [160:87] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'cachedResults' @ [161:21] ==> val cachedResults: List<ResolveElementCache.CachedPartialResolve?> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'all' @ [161:35] ==> public inline fun <T> Iterable<ResolveElementCache.CachedPartialResolve?>.all(predicate: (ResolveElementCache.CachedPartialResolve?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CachedPartialResolve?

'it' @ [161:41] ==> value-parameter it: ResolveElementCache.CachedPartialResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [161:55] ==> value-parameter it: ResolveElementCache.CachedPartialResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'isUpToDate' @ [161:58] ==> public final fun isUpToDate(file: KtFile, newMode: BodyResolveMode): Boolean defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[SimpleFunctionDescriptorImpl]

'file' @ [161:69] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'bodyResolveMode' @ [161:75] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'CompositeBindingContext' @ [162:28] ==> public companion object defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[FakeCallableDescriptorForObject]

'create' @ [162:52] ==> public final fun create(delegates: List<BindingContext>): BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion[DeserializedSimpleFunctionDescriptor]

'cachedResults' @ [162:59] ==> val cachedResults: List<ResolveElementCache.CachedPartialResolve?> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'map' @ [162:73] ==> public inline fun <T, R> Iterable<ResolveElementCache.CachedPartialResolve?>.map(transform: (ResolveElementCache.CachedPartialResolve?) -> BindingContext): List<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CachedPartialResolve?
    <R> -> BindingContext

'it' @ [162:79] ==> value-parameter it: ResolveElementCache.CachedPartialResolve? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [162:84] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[PropertyDescriptorImpl]

'distinct' @ [162:101] ==> public fun <T> Iterable<BindingContext>.distinct(): List<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'component1' @ [165:22] ==> public final operator fun component1(): BindingContext defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [165:38] ==> public final operator fun component2(): StatementFilter defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'performElementAdditionalResolve' @ [165:57] ==> private final fun performElementAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): Pair<BindingContext, StatementFilter> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveElement' @ [165:89] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'contextElements' @ [165:105] ==> value-parameter contextElements: Collection<KtElement>? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [165:122] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'statementFilter' @ [167:21] ==> val statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'NONE' @ [167:56] ==> @field:JvmField public final val NONE: StatementFilter defined in org.jetbrains.kotlin.resolve.StatementFilter.Companion[DeserializedPropertyDescriptor]

'fullResolveMap' @ [168:21] ==> val fullResolveMap: (MutableMap<KtElement, ResolveElementCache.CachedFullResolve>..MutableMap<KtElement, ResolveElementCache.CachedFullResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [168:36] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'CachedFullResolve' @ [168:54] ==> public constructor CachedFullResolve(bindingContext: BindingContext, resolveElement: KtElement) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedFullResolve[ClassConstructorDescriptorImpl]

'bindingContext' @ [168:72] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [168:88] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'bindingContext' @ [169:28] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'CachedPartialResolve' @ [172:38] ==> public constructor CachedPartialResolve(bindingContext: BindingContext, file: KtFile, mode: BodyResolveMode) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.CachedPartialResolve[ClassConstructorDescriptorImpl]

'bindingContext' @ [172:59] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'file' @ [172:75] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'bodyResolveMode' @ [172:81] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'iterator' @ [174:35] ==> public abstract fun iterator(): Iterator<KtExpression> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'statementFilter' @ [174:36] ==> val statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'allStatementsToResolve' @ [174:81] ==> public final val allStatementsToResolve: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[DeserializedPropertyDescriptor]

'!' @ [175:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'partialResolveMap' @ [175:26] ==> val partialResolveMap: (MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'containsKey' @ [175:44] ==> public abstract fun containsKey(key: KtExpression): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'statement' @ [175:56] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [175:70] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'PROCESSED' @ [175:100] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'statement' @ [175:111] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'partialResolveMap' @ [176:25] ==> val partialResolveMap: (MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'statement' @ [176:43] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveToCache' @ [176:56] ==> val resolveToCache: ResolveElementCache.CachedPartialResolve defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'partialResolveMap' @ [181:17] ==> val partialResolveMap: (MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>..MutableMap<KtExpression, ResolveElementCache.CachedPartialResolve>?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [181:35] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToCache' @ [181:53] ==> val resolveToCache: ResolveElementCache.CachedPartialResolve defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [183:24] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getElementsAdditionalResolve[LocalVariableDescriptor]

'FULL' @ [188:111] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'elements' @ [189:84] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[ValueParameterDescriptorImpl]

'groupBy' @ [189:93] ==> public inline fun <T, K> Iterable<KtElement>.groupBy(keySelector: (KtElement) -> KtElement?): Map<KtElement?, List<KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <K> -> KtElement?

'findElementOfAdditionalResolve' @ [189:103] ==> private final fun findElementOfAdditionalResolve(element: KtElement): KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'it' @ [189:134] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [191:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> BindingContext

'ArrayList' @ [192:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtDeclaration

'component1' @ [194:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement?, List<KtElement>>.component1(): KtElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement?
    <V> -> List<KtElement>

'component2' @ [194:43] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement?, List<KtElement>>.component2(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement?
    <V> -> List<KtElement>

'elementsByAdditionalResolveElement' @ [194:63] ==> val elementsByAdditionalResolveElement: Map<KtElement?, List<KtElement>> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'if (elementOfAdditionalResolve != null) {
                if (elementOfAdditionalResolve !is KtParameter) {
                    val bindingContext = getElementsAdditionalResolve(elementOfAdditionalResolve, contextElements, bodyResolveMode)
                    bindingContexts.add(bindingContext)
                }
                else {
                    // Parameters for function literal could be met inside other parameters. We can't make resolveToDescriptors for internal elements.
                    declarationsToResolve.addIfNotNull(elementOfAdditionalResolve.getNonStrictParentOfType<KtDeclaration>())
                    addResolveSessionBindingContext = true
                }
            }
            else {
                contextElements
                        .mapNotNull { it.getNonStrictParentOfType<KtDeclaration>() }
                        .filterTo(declarationsToResolve) {
                            it !is KtAnonymousInitializer && it !is KtDestructuringDeclaration && it !is KtDestructuringDeclarationEntry
                        }
                addResolveSessionBindingContext = true
            }' @ [195:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'elementOfAdditionalResolve' @ [195:17] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'if (elementOfAdditionalResolve !is KtParameter) {
                    val bindingContext = getElementsAdditionalResolve(elementOfAdditionalResolve, contextElements, bodyResolveMode)
                    bindingContexts.add(bindingContext)
                }
                else {
                    // Parameters for function literal could be met inside other parameters. We can't make resolveToDescriptors for internal elements.
                    declarationsToResolve.addIfNotNull(elementOfAdditionalResolve.getNonStrictParentOfType<KtDeclaration>())
                    addResolveSessionBindingContext = true
                }' @ [196:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'elementOfAdditionalResolve' @ [196:21] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'getElementsAdditionalResolve' @ [197:42] ==> public final fun getElementsAdditionalResolve(resolveElement: KtElement, contextElements: Collection<KtElement>?, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'elementOfAdditionalResolve' @ [197:71] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'contextElements' @ [197:99] ==> val contextElements: List<KtElement> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'bodyResolveMode' @ [197:116] ==> value-parameter bodyResolveMode: BodyResolveMode = ... defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[ValueParameterDescriptorImpl]

'bindingContexts' @ [198:21] ==> val bindingContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'add' @ [198:37] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [198:41] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'declarationsToResolve' @ [202:21] ==> val declarationsToResolve: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'addIfNotNull' @ [202:43] ==> public fun <T : Any> MutableCollection<KtDeclaration>.addIfNotNull(t: KtDeclaration?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtDeclaration

'elementOfAdditionalResolve' @ [202:56] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [202:83] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'addResolveSessionBindingContext' @ [203:21] ==> var addResolveSessionBindingContext: Boolean defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'contextElements' @ [207:17] ==> val contextElements: List<KtElement> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'mapNotNull' @ [208:26] ==> public inline fun <T, R : Any> Iterable<KtElement>.mapNotNull(transform: (KtElement) -> KtDeclaration?): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R : Any> -> KtDeclaration

'it' @ [208:39] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [208:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'filterTo' @ [209:26] ==> public inline fun <T, C : MutableCollection<in KtDeclaration>> Iterable<KtDeclaration>.filterTo(destination: ArrayList<KtDeclaration>, predicate: (KtDeclaration) -> Boolean): ArrayList<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <C : MutableCollection<in T>> -> ArrayList<KtDeclaration>

'declarationsToResolve' @ [209:35] ==> val declarationsToResolve: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'it' @ [210:29] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [210:62] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [210:99] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'addResolveSessionBindingContext' @ [212:17] ==> var addResolveSessionBindingContext: Boolean defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'declarationsToResolve' @ [216:9] ==> val declarationsToResolve: ArrayList<KtDeclaration> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'forEach' @ [216:31] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'resolveSession' @ [216:41] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveToDescriptor' @ [216:56] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'it' @ [216:76] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements.<anonymous>[ValueParameterDescriptorImpl]

'addResolveSessionBindingContext' @ [217:13] ==> var addResolveSessionBindingContext: Boolean defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'bindingContexts' @ [218:13] ==> val bindingContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'add' @ [218:29] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'resolveSession' @ [218:33] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'bindingContext' @ [218:48] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'CompositeBindingContext' @ [222:16] ==> public companion object defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[FakeCallableDescriptorForObject]

'create' @ [222:40] ==> public final fun create(delegates: List<BindingContext>): BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion[DeserializedSimpleFunctionDescriptor]

'bindingContexts' @ [222:47] ==> val bindingContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.resolveToElements[LocalVariableDescriptor]

'getTopmostParentOfTypes' @ [226:52] ==> @Nullable @Contract public open fun getTopmostParentOfTypes(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [227:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'java' @ [228:40] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'java' @ [229:47] ==> public val <T> KClass<KtAnonymousInitializer>.java: Class<KtAnonymousInitializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'java' @ [230:45] ==> public val <T> KClass<KtPrimaryConstructor>.java: Class<KtPrimaryConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor

'java' @ [231:47] ==> public val <T> KClass<KtSecondaryConstructor>.java: Class<KtSecondaryConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'java' @ [232:35] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [233:40] ==> public val <T> KClass<KtSuperTypeList>.java: Class<KtSuperTypeList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSuperTypeList

'java' @ [234:42] ==> public val <T> KClass<KtInitializerList>.java: Class<KtInitializerList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtInitializerList

'java' @ [235:37] ==> public val <T> KClass<KtImportList>.java: Class<KtImportList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtImportList

'java' @ [236:42] ==> public val <T> KClass<KtAnnotationEntry>.java: Class<KtAnnotationEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'java' @ [237:40] ==> public val <T> KClass<KtTypeParameter>.java: Class<KtTypeParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'java' @ [238:41] ==> public val <T> KClass<KtTypeConstraint>.java: Class<KtTypeConstraint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeConstraint

'java' @ [239:43] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'KtCodeFragment' @ [240:17] ==> public companion object defined in org.jetbrains.kotlin.psi.KtCodeFragment[FakeCallableDescriptorForObject]

'java' @ [240:39] ==> public val <T> KClass<KtCodeFragment>.java: Class<KtCodeFragment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCodeFragment

'java' @ [241:36] ==> public val <T> KClass<KtTypeAlias>.java: Class<KtTypeAlias> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeAlias

'when (elementOfAdditionalResolve) {
            null -> {
                // Case of JetAnnotationEntry on top level class
                if (element is KtAnnotationEntry) {
                    return element
                }

                if (element is KtFileAnnotationList) {
                    return element
                }

                return null
            }

            is KtPackageDirective -> return element

            is KtDeclaration -> {
                if (element is KtParameter && !KtPsiUtil.isLocal(element)) {
                    return null
                }

                return elementOfAdditionalResolve
            }

            else -> return elementOfAdditionalResolve
        }' @ [243:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'elementOfAdditionalResolve' @ [243:15] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[LocalVariableDescriptor]

'element' @ [246:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'element' @ [247:28] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'element' @ [250:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'element' @ [251:28] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'element' @ [257:45] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'element' @ [260:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'!' @ [260:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [260:58] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [260:66] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[ValueParameterDescriptorImpl]

'elementOfAdditionalResolve' @ [264:24] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[LocalVariableDescriptor]

'elementOfAdditionalResolve' @ [267:28] ==> val elementOfAdditionalResolve: KtElement? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.findElementOfAdditionalResolve[LocalVariableDescriptor]

'contextElements' @ [276:13] ==> value-parameter contextElements: Collection<KtElement>? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'assert' @ [277:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bodyResolveMode' @ [277:20] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [277:55] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolveElement' @ [280:20] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'containingKtFile' @ [280:35] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'StatementFilter' @ [282:35] ==> public companion object defined in org.jetbrains.kotlin.resolve.StatementFilter[FakeCallableDescriptorForObject]

'NONE' @ [282:51] ==> @field:JvmField public final val NONE: StatementFilter defined in org.jetbrains.kotlin.resolve.StatementFilter.Companion[DeserializedPropertyDescriptor]

'assert' @ [285:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolveElement' @ [285:20] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [286:17] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'FULL' @ [286:52] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statementFilterUsed' @ [287:17] ==> var statementFilterUsed: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'PartialBodyResolveFilter' @ [287:39] ==> public constructor PartialBodyResolveFilter(elementsToResolve: Collection<KtElement>, declaration: KtDeclaration, probablyNothingCallableNames: ProbablyNothingCallableNames, forCompletion: Boolean) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[DeserializedClassConstructorDescriptor]

'contextElements' @ [288:25] ==> value-parameter contextElements: Collection<KtElement>? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'resolveElement' @ [289:25] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'probablyNothingCallableNames' @ [290:25] ==> private final fun probablyNothingCallableNames(): ProbablyNothingCallableNames defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [291:25] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'PARTIAL_FOR_COMPLETION' @ [291:60] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'statementFilterUsed' @ [293:20] ==> var statementFilterUsed: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'when (resolveElement) {
            is KtNamedFunction -> functionAdditionalResolve(resolveSession, resolveElement, file, createStatementFilter(), bodyResolveMode.bindingTraceFilter)

            is KtAnonymousInitializer -> initializerAdditionalResolve(resolveSession, resolveElement, file, createStatementFilter(), bodyResolveMode.bindingTraceFilter)

            is KtPrimaryConstructor -> constructorAdditionalResolve(resolveSession, resolveElement.parent as KtClassOrObject, file, bodyResolveMode.bindingTraceFilter)

            is KtSecondaryConstructor -> secondaryConstructorAdditionalResolve(resolveSession, resolveElement, file, createStatementFilter(), bodyResolveMode.bindingTraceFilter)

            is KtProperty -> propertyAdditionalResolve(resolveSession, resolveElement, file, createStatementFilter(), bodyResolveMode.bindingTraceFilter)

            is KtSuperTypeList -> delegationSpecifierAdditionalResolve(resolveSession, resolveElement, resolveElement.getParent() as KtClassOrObject, file, bodyResolveMode.bindingTraceFilter)

            is KtInitializerList -> delegationSpecifierAdditionalResolve(resolveSession, resolveElement, resolveElement.getParent() as KtEnumEntry, file, bodyResolveMode.bindingTraceFilter)

            is KtImportList -> {
                val resolver = resolveSession.fileScopeProvider.getImportResolver(resolveElement.getContainingKtFile())
                resolver.forceResolveAllImports()
                resolveSession.trace
            }

            is KtFileAnnotationList -> {
                val annotationEntry = resolveElement.annotationEntries.firstOrNull()
                if (annotationEntry != null) {
                    annotationAdditionalResolve(resolveSession, annotationEntry)
                }
                else {
                    resolveSession.trace
                }
            }

            is KtAnnotationEntry -> annotationAdditionalResolve(resolveSession, resolveElement)

            is KtTypeAlias -> typealiasAdditionalResolve(resolveSession, resolveElement, bodyResolveMode.bindingTraceFilter)

            is KtTypeParameter -> typeParameterAdditionalResolve(resolveSession, resolveElement)

            is KtTypeConstraint -> typeConstraintAdditionalResolve(resolveSession, resolveElement)

            is KtCodeFragment -> codeFragmentAdditionalResolve(resolveElement, bodyResolveMode)

            else -> {
                if (resolveElement.getParentOfType<KtPackageDirective>(true) != null) {
                    packageRefAdditionalResolve(resolveSession, resolveElement, bodyResolveMode.bindingTraceFilter)
                }
                else {
                    error("Invalid type of the topmost parent: $resolveElement\n${resolveElement.getElementTextWithContext()}")
                }
            }
        }' @ [296:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BindingTrace, entry1: BindingTrace, entry2: BindingTrace, entry3: BindingTrace, entry4: BindingTrace, entry5: BindingTrace, entry6: BindingTrace, entry7: BindingTrace, entry8: BindingTrace, entry9: BindingTrace, entry10: BindingTrace, entry11: BindingTrace, entry12: BindingTrace, entry13: BindingTrace, entry14: BindingTrace): BindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BindingTrace

'resolveElement' @ [296:41] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'functionAdditionalResolve' @ [297:35] ==> private final fun functionAdditionalResolve(resolveSession: ResolveSession, namedFunction: KtNamedFunction, file: KtFile, statementFilter: StatementFilter, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [297:61] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [297:77] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'file' @ [297:93] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'createStatementFilter' @ [297:99] ==> local final fun createStatementFilter(): StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [297:124] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [297:140] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'initializerAdditionalResolve' @ [299:42] ==> private final fun initializerAdditionalResolve(resolveSession: ResolveSession, anonymousInitializer: KtAnonymousInitializer, file: KtFile, statementFilter: StatementFilter, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [299:71] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [299:87] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'file' @ [299:103] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'createStatementFilter' @ [299:109] ==> local final fun createStatementFilter(): StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [299:134] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [299:150] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'constructorAdditionalResolve' @ [301:40] ==> private final fun constructorAdditionalResolve(resolveSession: ResolveSession, klass: KtClassOrObject, file: KtFile, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [301:69] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [301:85] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'parent' @ [301:100] ==> public final val KtPrimaryConstructor.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'file' @ [301:127] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'bodyResolveMode' @ [301:133] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [301:149] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'secondaryConstructorAdditionalResolve' @ [303:42] ==> private final fun secondaryConstructorAdditionalResolve(resolveSession: ResolveSession, constructor: KtSecondaryConstructor, file: KtFile, statementFilter: StatementFilter, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [303:80] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [303:96] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'file' @ [303:112] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'createStatementFilter' @ [303:118] ==> local final fun createStatementFilter(): StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [303:143] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [303:159] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'propertyAdditionalResolve' @ [305:30] ==> private final fun propertyAdditionalResolve(resolveSession: ResolveSession, property: KtProperty, file: KtFile, statementFilter: StatementFilter, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [305:56] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [305:72] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'file' @ [305:88] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'createStatementFilter' @ [305:94] ==> local final fun createStatementFilter(): StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[SimpleFunctionDescriptorImpl]

'bodyResolveMode' @ [305:119] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [305:135] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'delegationSpecifierAdditionalResolve' @ [307:35] ==> private final fun delegationSpecifierAdditionalResolve(resolveSession: ResolveSession, ktElement: KtElement, classOrObject: KtClassOrObject, file: KtFile, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [307:72] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [307:88] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'resolveElement' @ [307:104] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'getParent' @ [307:119] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'file' @ [307:151] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'bodyResolveMode' @ [307:157] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [307:173] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'delegationSpecifierAdditionalResolve' @ [309:37] ==> private final fun delegationSpecifierAdditionalResolve(resolveSession: ResolveSession, ktElement: KtElement, classOrObject: KtClassOrObject, file: KtFile, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [309:74] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [309:90] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'resolveElement' @ [309:106] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'getParent' @ [309:121] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'file' @ [309:149] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'bodyResolveMode' @ [309:155] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [309:171] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'resolveSession' @ [312:32] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'fileScopeProvider' @ [312:47] ==> public final var ResolveSession.fileScopeProvider: FileScopeProvider[MyPropertyDescriptor]

'getImportResolver' @ [312:65] ==> public open fun getImportResolver(file: KtFile): ImportResolver defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[DeserializedSimpleFunctionDescriptor]

'resolveElement' @ [312:83] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'getContainingKtFile' @ [312:98] ==> @NotNull public abstract fun getContainingKtFile(): KtFile defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'resolver' @ [313:17] ==> val resolver: ImportResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'forceResolveAllImports' @ [313:26] ==> public abstract fun forceResolveAllImports(): Unit defined in org.jetbrains.kotlin.resolve.lazy.ImportResolver[DeserializedSimpleFunctionDescriptor]

'resolveSession' @ [314:17] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'trace' @ [314:32] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'resolveElement' @ [318:39] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'annotationEntries' @ [318:54] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'firstOrNull' @ [318:72] ==> public fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>.firstOrNull(): KtAnnotationEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'if (annotationEntry != null) {
                    annotationAdditionalResolve(resolveSession, annotationEntry)
                }
                else {
                    resolveSession.trace
                }' @ [319:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BindingTrace, elseBranch: BindingTrace): BindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BindingTrace

'annotationEntry' @ [319:21] ==> val annotationEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'annotationAdditionalResolve' @ [320:21] ==> private final fun annotationAdditionalResolve(resolveSession: ResolveSession, ktAnnotationEntry: KtAnnotationEntry): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [320:49] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'annotationEntry' @ [320:65] ==> val annotationEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'resolveSession' @ [323:21] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'trace' @ [323:36] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'annotationAdditionalResolve' @ [327:37] ==> private final fun annotationAdditionalResolve(resolveSession: ResolveSession, ktAnnotationEntry: KtAnnotationEntry): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [327:65] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [327:81] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'typealiasAdditionalResolve' @ [329:31] ==> private final fun typealiasAdditionalResolve(resolveSession: ResolveSession, typeAlias: KtTypeAlias, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [329:58] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [329:74] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [329:90] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [329:106] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'typeParameterAdditionalResolve' @ [331:35] ==> private final fun typeParameterAdditionalResolve(analyzer: KotlinCodeAnalyzer, typeParameter: KtTypeParameter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [331:66] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [331:82] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'typeConstraintAdditionalResolve' @ [333:36] ==> private final fun typeConstraintAdditionalResolve(analyzer: KotlinCodeAnalyzer, jetTypeConstraint: KtTypeConstraint): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [333:68] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [333:84] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'codeFragmentAdditionalResolve' @ [335:34] ==> private final fun codeFragmentAdditionalResolve(codeFragment: KtCodeFragment, bodyResolveMode: BodyResolveMode): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveElement' @ [335:64] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [335:80] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'if (resolveElement.getParentOfType<KtPackageDirective>(true) != null) {
                    packageRefAdditionalResolve(resolveSession, resolveElement, bodyResolveMode.bindingTraceFilter)
                }
                else {
                    error("Invalid type of the topmost parent: $resolveElement\n${resolveElement.getElementTextWithContext()}")
                }' @ [338:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BindingTrace, elseBranch: BindingTrace): BindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BindingTrace

'resolveElement' @ [338:21] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'getParentOfType' @ [338:36] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtPackageDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPackageDirective

'packageRefAdditionalResolve' @ [339:21] ==> private final fun packageRefAdditionalResolve(resolveSession: ResolveSession, ktElement: KtElement, bindingTraceFilter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [339:49] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'resolveElement' @ [339:65] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [339:81] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [339:97] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'error' @ [342:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolveElement' @ [342:65] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'resolveElement' @ [342:83] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [342:98] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'DelegatingBindingTrace' @ [347:32] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, debugName: String, resolutionSubjectForMessage: Any?, filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'trace' @ [347:55] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [347:61] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolveElement' @ [347:109] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'ControlFlowInformationProvider' @ [348:9] ==> public constructor ControlFlowInformationProvider(declaration: KtElement, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[DeserializedClassConstructorDescriptor]

'resolveElement' @ [348:40] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'controlFlowTrace' @ [348:56] ==> val controlFlowTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'resolveElement' @ [348:74] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [348:89] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'checkDeclaration' @ [348:114] ==> public final fun checkDeclaration(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[DeserializedSimpleFunctionDescriptor]

'controlFlowTrace' @ [349:9] ==> val controlFlowTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'addOwnDataTo' @ [349:26] ==> @JvmOverloads public final fun addOwnDataTo(trace: BindingTrace, filter: TraceEntryFilter? = ..., commitDiagnostics: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedSimpleFunctionDescriptor]

'trace' @ [349:39] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'Pair' @ [351:16] ==> public constructor Pair<out A, out B>(first: BindingContext, second: StatementFilter) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> BindingContext
    <out B> -> StatementFilter

'trace' @ [351:21] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [351:27] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'statementFilterUsed' @ [351:43] ==> var statementFilterUsed: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.performElementAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [356:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'ktElement' @ [356:43] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [356:54] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'ktElement' @ [358:13] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'ktElement' @ [359:26] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'getParentOfType' @ [359:36] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtPackageDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPackageDirective

'isValidIdentifier' @ [361:22] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ktElement' @ [361:40] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'getReferencedName' @ [361:50] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'trace' @ [362:21] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'bindingContext' @ [362:27] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'REFERENCE_TARGET' @ [362:57] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktElement' @ [362:75] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'header' @ [363:34] ==> val header: KtPackageDirective defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'getFqName' @ [363:41] ==> @NotNull public open fun getFqName(p0: (KtSimpleNameExpression..KtSimpleNameExpression?)): FqName defined in org.jetbrains.kotlin.psi.KtPackageDirective[JavaMethodDescriptor]

'ktElement' @ [363:51] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [364:45] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [364:60] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getPackage' @ [364:77] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [364:88] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'trace' @ [365:21] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'record' @ [365:27] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?), p2: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [365:49] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktElement' @ [365:67] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[ValueParameterDescriptorImpl]

'packageDescriptor' @ [365:78] ==> val packageDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'trace' @ [370:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.packageRefAdditionalResolve[LocalVariableDescriptor]

'jetTypeConstraint' @ [374:27] ==> value-parameter jetTypeConstraint: KtTypeConstraint defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeConstraintAdditionalResolve[ValueParameterDescriptorImpl]

'getParentOfType' @ [374:45] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'analyzer' @ [375:26] ==> value-parameter analyzer: KotlinCodeAnalyzer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeConstraintAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [375:35] ==> @NotNull public abstract fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.KotlinCodeAnalyzer[JavaMethodDescriptor]

'declaration' @ [375:55] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeConstraintAdditionalResolve[LocalVariableDescriptor]

'descriptor' @ [377:37] ==> val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeConstraintAdditionalResolve[LocalVariableDescriptor]

'declaredTypeParameters' @ [377:48] ==> public final val ClassifierDescriptorWithTypeParameters.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forceResolveAllContents' @ [378:30] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: TypeParameterDescriptor): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeParameterDescriptor

'parameterDescriptor' @ [378:79] ==> val parameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeConstraintAdditionalResolve[LocalVariableDescriptor]

'resolveSession' @ [381:16] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'trace' @ [381:31] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'createDelegatingTrace' @ [385:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'codeFragment' @ [385:43] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [385:57] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [385:73] ==> public final val bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[DeserializedPropertyDescriptor]

'if (bodyResolveMode == BodyResolveMode.PARTIAL)
            BodyResolveMode.PARTIAL_FOR_COMPLETION
        else
            bodyResolveMode' @ [387:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BodyResolveMode, elseBranch: BodyResolveMode): BodyResolveMode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BodyResolveMode

'bodyResolveMode' @ [387:38] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[ValueParameterDescriptorImpl]

'PARTIAL' @ [387:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'PARTIAL_FOR_COMPLETION' @ [388:29] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bodyResolveMode' @ [390:13] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[ValueParameterDescriptorImpl]

'codeFragmentAnalyzer' @ [391:9] ==> private final val codeFragmentAnalyzer: CodeFragmentAnalyzer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'analyzeCodeFragment' @ [391:30] ==> public final fun analyzeCodeFragment(codeFragment: KtCodeFragment, trace: BindingTrace, bodyResolveMode: BodyResolveMode): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[SimpleFunctionDescriptorImpl]

'codeFragment' @ [391:50] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [391:64] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[LocalVariableDescriptor]

'contextResolveMode' @ [391:71] ==> val contextResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[LocalVariableDescriptor]

'trace' @ [393:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.codeFragmentAdditionalResolve[LocalVariableDescriptor]

'ktAnnotationEntry' @ [397:28] ==> value-parameter ktAnnotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'getParentOfType' @ [397:46] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtModifierList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtModifierList

'modifierList' @ [398:27] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'getParentOfType' @ [398:41] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'if (declaration != null) {
            doResolveAnnotations(getAnnotationsByDeclaration(resolveSession, modifierList, declaration))
        }
        else {
            val fileAnnotationList = ktAnnotationEntry.getParentOfType<KtFileAnnotationList>(true)
            if (fileAnnotationList != null) {
                doResolveAnnotations(resolveSession.getFileAnnotations(fileAnnotationList.containingKtFile))
            }
            if (modifierList != null && modifierList.parent is KtFile) {
                doResolveAnnotations(resolveSession.getDanglingAnnotations(modifierList.containingKtFile))
            }
        }' @ [399:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [399:13] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'doResolveAnnotations' @ [400:13] ==> private final fun doResolveAnnotations(annotations: Annotations): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'getAnnotationsByDeclaration' @ [400:34] ==> private final fun getAnnotationsByDeclaration(resolveSession: ResolveSession, modifierList: KtModifierList, declaration: KtDeclaration): Annotations defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [400:62] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'modifierList' @ [400:78] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'declaration' @ [400:92] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'ktAnnotationEntry' @ [403:38] ==> value-parameter ktAnnotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'getParentOfType' @ [403:56] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtFileAnnotationList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFileAnnotationList

'fileAnnotationList' @ [404:17] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'doResolveAnnotations' @ [405:17] ==> private final fun doResolveAnnotations(annotations: Annotations): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [405:38] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'getFileAnnotations' @ [405:53] ==> @NotNull public open fun getFileAnnotations(@NotNull p0: KtFile): Annotations defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'fileAnnotationList' @ [405:72] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'containingKtFile' @ [405:91] ==> public final val KtFileAnnotationList.containingKtFile: KtFile[MyPropertyDescriptor]

'modifierList' @ [407:17] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'modifierList' @ [407:41] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'parent' @ [407:54] ==> public final val KtModifierList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'doResolveAnnotations' @ [408:17] ==> private final fun doResolveAnnotations(annotations: Annotations): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [408:38] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'getDanglingAnnotations' @ [408:53] ==> @NotNull public open fun getDanglingAnnotations(@NotNull p0: KtFile): Annotations defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'modifierList' @ [408:76] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[LocalVariableDescriptor]

'containingKtFile' @ [408:89] ==> public final val KtModifierList.containingKtFile: KtFile[MyPropertyDescriptor]

'resolveSession' @ [412:16] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.annotationAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [412:31] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'forceResolveAllContents' @ [416:26] ==> public open fun forceResolveAllContents(@NotNull p0: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'annotations' @ [416:50] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.doResolveAnnotations[ValueParameterDescriptorImpl]

'resolveSession' @ [420:26] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [420:41] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'declaration' @ [420:61] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [421:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'modifierList' @ [422:17] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [422:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'primaryConstructorModifierList' @ [422:45] ==> public final val KtClass.primaryConstructorModifierList: KtModifierList?[MyPropertyDescriptor]

'descriptor' @ [423:17] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[LocalVariableDescriptor]

'?:' @ [423:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [423:31] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [423:62] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'error' @ [424:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [424:64] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'getText' @ [424:76] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'declaration' @ [428:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'modifierList' @ [428:47] ==> value-parameter modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'parent' @ [428:60] ==> public final val KtModifierList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'declaration' @ [428:70] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[ValueParameterDescriptorImpl]

'getBody' @ [428:82] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [428:95] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[LocalVariableDescriptor]

'descriptor' @ [429:20] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[LocalVariableDescriptor]

'danglingAnnotations' @ [429:31] ==> public final val LazyClassDescriptor.danglingAnnotations: Annotations[MyPropertyDescriptor]

'descriptor' @ [432:16] ==> var descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.getAnnotationsByDeclaration[LocalVariableDescriptor]

'annotations' @ [432:27] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'analyzer' @ [436:26] ==> value-parameter analyzer: KotlinCodeAnalyzer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeParameterAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [436:35] ==> @NotNull public abstract fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.KotlinCodeAnalyzer[JavaMethodDescriptor]

'typeParameter' @ [436:55] ==> value-parameter typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeParameterAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [437:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: DeclarationDescriptor): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'descriptor' @ [437:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typeParameterAdditionalResolve[LocalVariableDescriptor]

'resolveSession' @ [439:16] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'trace' @ [439:31] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'createDelegatingTrace' @ [445:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'ktElement' @ [445:43] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [445:54] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [446:26] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [446:41] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'classOrObject' @ [446:61] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [449:26] ==> public open fun forceResolveAllContents(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'descriptor' @ [449:50] ==> val descriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'typeConstructor' @ [449:61] ==> public final val LazyClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [449:77] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'createBodyResolver' @ [451:28] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [451:47] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [451:63] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'file' @ [451:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'NONE' @ [451:92] ==> @field:JvmField public final val NONE: StatementFilter defined in org.jetbrains.kotlin.resolve.StatementFilter.Companion[DeserializedPropertyDescriptor]

'bodyResolver' @ [452:9] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'resolveSuperTypeEntryList' @ [452:22] ==> public open fun resolveSuperTypeEntryList(@NotNull p0: DataFlowInfo, @NotNull p1: KtClassOrObject, @NotNull p2: ClassDescriptor, @Nullable p3: ConstructorDescriptor?, @NotNull p4: LexicalScope, @NotNull p5: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'EMPTY' @ [452:61] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'classOrObject' @ [453:48] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[ValueParameterDescriptorImpl]

'descriptor' @ [454:48] ==> val descriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'descriptor' @ [455:48] ==> val descriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [455:59] ==> public final val LazyClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'descriptor' @ [456:48] ==> val descriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'scopeForConstructorHeaderResolution' @ [456:59] ==> public final val LazyClassDescriptor.scopeForConstructorHeaderResolution: LexicalScope[MyPropertyDescriptor]

'descriptor' @ [457:48] ==> val descriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'scopeForMemberDeclarationResolution' @ [457:59] ==> public final val LazyClassDescriptor.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'trace' @ [459:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.delegationSpecifierAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [466:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'property' @ [466:43] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [466:53] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'createBodyResolver' @ [468:28] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [468:47] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [468:63] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'file' @ [468:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'statementFilter' @ [468:76] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [469:26] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [469:41] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'property' @ [469:61] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [470:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: PropertyDescriptor): (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertyDescriptor

'descriptor' @ [470:50] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'BodyResolveContextForLazy' @ [472:34] ==> public constructor BodyResolveContextForLazy(topDownAnalysisMode: TopDownAnalysisMode, declaringScopes: (KtDeclaration) -> LexicalScope?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.BodyResolveContextForLazy[ClassConstructorDescriptorImpl]

'LocalDeclarations' @ [472:80] ==> enum entry LocalDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'assert' @ [473:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [473:20] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [473:32] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'property' @ [473:42] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'declaration' @ [473:54] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [473:69] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'declaration' @ [474:94] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'resolveSession' @ [476:13] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'declarationScopeProvider' @ [476:28] ==> public open val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getResolutionScopeForDeclaration' @ [476:53] ==> @NotNull public abstract fun getResolutionScopeForDeclaration(@NotNull p0: PsiElement): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'declaration' @ [476:86] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve.<anonymous>[ValueParameterDescriptorImpl]

'bodyResolver' @ [479:9] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'resolveProperty' @ [479:22] ==> public open fun resolveProperty(@NotNull p0: BodiesResolveContext, @NotNull p1: KtProperty, @NotNull p2: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'bodyResolveContext' @ [479:38] ==> val bodyResolveContext: ResolveElementCache.BodyResolveContextForLazy defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'property' @ [479:58] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'descriptor' @ [479:68] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [481:9] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'property' @ [481:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'property' @ [483:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[ValueParameterDescriptorImpl]

'accessors' @ [483:35] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'ControlFlowInformationProvider' @ [484:13] ==> public constructor ControlFlowInformationProvider(declaration: KtElement, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[DeserializedClassConstructorDescriptor]

'accessor' @ [484:44] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'trace' @ [484:54] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'accessor' @ [484:61] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'languageVersionSettings' @ [484:70] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'checkDeclaration' @ [484:95] ==> public final fun checkDeclaration(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[DeserializedSimpleFunctionDescriptor]

'trace' @ [487:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.propertyAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [493:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'namedFunction' @ [493:43] ==> value-parameter namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [493:58] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [495:21] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'declarationScopeProvider' @ [495:36] ==> public open val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getResolutionScopeForDeclaration' @ [495:61] ==> @NotNull public abstract fun getResolutionScopeForDeclaration(@NotNull p0: PsiElement): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'namedFunction' @ [495:94] ==> value-parameter namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [496:34] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [496:49] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'namedFunction' @ [496:69] ==> value-parameter namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [497:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: FunctionDescriptor): (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionDescriptor

'functionDescriptor' @ [497:50] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'createBodyResolver' @ [499:28] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [499:47] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [499:63] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'file' @ [499:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'statementFilter' @ [499:76] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolver' @ [500:9] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'resolveFunctionBody' @ [500:22] ==> public open fun resolveFunctionBody(@NotNull p0: DataFlowInfo, @NotNull p1: BindingTrace, @NotNull p2: KtDeclarationWithBody, @NotNull p3: FunctionDescriptor, @NotNull p4: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'EMPTY' @ [500:55] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'trace' @ [500:62] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'namedFunction' @ [500:69] ==> value-parameter namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'functionDescriptor' @ [500:84] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'scope' @ [500:104] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [502:9] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'namedFunction' @ [502:39] ==> value-parameter namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [504:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.functionAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [510:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'constructor' @ [510:43] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [510:56] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [512:21] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'declarationScopeProvider' @ [512:36] ==> public open val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getResolutionScopeForDeclaration' @ [512:61] ==> @NotNull public abstract fun getResolutionScopeForDeclaration(@NotNull p0: PsiElement): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'constructor' @ [512:94] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [513:37] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [513:52] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'constructor' @ [513:72] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [514:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: ClassConstructorDescriptor): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassConstructorDescriptor

'constructorDescriptor' @ [514:50] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'createBodyResolver' @ [516:28] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [516:47] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [516:63] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'file' @ [516:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'statementFilter' @ [516:76] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolver' @ [517:9] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'resolveSecondaryConstructorBody' @ [517:22] ==> public open fun resolveSecondaryConstructorBody(@NotNull p0: DataFlowInfo, @NotNull p1: BindingTrace, @NotNull p2: KtSecondaryConstructor, @NotNull p3: ClassConstructorDescriptor, @NotNull p4: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'EMPTY' @ [517:67] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'trace' @ [517:74] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'constructor' @ [517:81] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [517:94] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'scope' @ [517:117] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [519:9] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'constructor' @ [519:39] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [521:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.secondaryConstructorAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [525:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'klass' @ [525:43] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'filter' @ [525:50] ==> value-parameter filter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [527:31] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [527:46] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'klass' @ [527:66] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'classDescriptor' @ [528:37] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [528:53] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'error' @ [529:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [529:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [529:94] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'klass' @ [530:64] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [530:70] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'forceResolveAllContents' @ [531:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: ClassConstructorDescriptor): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassConstructorDescriptor

'constructorDescriptor' @ [531:50] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'klass' @ [533:34] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'primaryConstructor' @ [533:40] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'primaryConstructor' @ [534:13] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'resolveSession' @ [535:25] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'declarationScopeProvider' @ [535:40] ==> public open val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'getResolutionScopeForDeclaration' @ [535:65] ==> @NotNull public abstract fun getResolutionScopeForDeclaration(@NotNull p0: PsiElement): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.DeclarationScopeProvider[JavaMethodDescriptor]

'primaryConstructor' @ [535:98] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'createBodyResolver' @ [536:32] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [536:51] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [536:67] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'file' @ [536:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[ValueParameterDescriptorImpl]

'NONE' @ [536:96] ==> @field:JvmField public final val NONE: StatementFilter defined in org.jetbrains.kotlin.resolve.StatementFilter.Companion[DeserializedPropertyDescriptor]

'bodyResolver' @ [537:13] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'resolveConstructorParameterDefaultValues' @ [537:26] ==> public open fun resolveConstructorParameterDefaultValues(@NotNull p0: DataFlowInfo, @NotNull p1: BindingTrace, @NotNull p2: KtPrimaryConstructor, @NotNull p3: ConstructorDescriptor, @NotNull p4: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'EMPTY' @ [537:80] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'trace' @ [537:87] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'primaryConstructor' @ [537:94] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'constructorDescriptor' @ [537:114] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'scope' @ [537:137] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [539:13] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'primaryConstructor' @ [539:43] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'trace' @ [542:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.constructorAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [547:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'typeAlias' @ [547:43] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [547:54] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [548:35] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [548:50] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'typeAlias' @ [548:70] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [549:26] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: DeclarationDescriptor): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'typeAliasDescriptor' @ [549:50] ==> val typeAliasDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [550:9] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'typeAlias' @ [550:39] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [551:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.typealiasAdditionalResolve[LocalVariableDescriptor]

'createDelegatingTrace' @ [557:21] ==> private final fun createDelegatingTrace(resolveElement: KtElement, filter: BindingTraceFilter): BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'anonymousInitializer' @ [557:43] ==> value-parameter anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'bindingTraceFilter' @ [557:65] ==> value-parameter bindingTraceFilter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'resolveSession' @ [559:39] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [559:54] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'anonymousInitializer' @ [559:74] ==> value-parameter anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'containingDeclaration' @ [559:95] ==> public abstract val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'createBodyResolver' @ [561:28] ==> private final fun createBodyResolver(resolveSession: ResolveSession, trace: BindingTrace, file: KtFile, statementFilter: StatementFilter): BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'resolveSession' @ [561:47] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [561:63] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[LocalVariableDescriptor]

'file' @ [561:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'statementFilter' @ [561:76] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'bodyResolver' @ [562:9] ==> val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[LocalVariableDescriptor]

'resolveAnonymousInitializer' @ [562:22] ==> public open fun resolveAnonymousInitializer(@NotNull p0: DataFlowInfo, @NotNull p1: KtAnonymousInitializer, @NotNull p2: ClassDescriptorWithResolutionScopes): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'EMPTY' @ [562:63] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'anonymousInitializer' @ [562:70] ==> value-parameter anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'classOrObjectDescriptor' @ [562:92] ==> val classOrObjectDescriptor: LazyClassDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[LocalVariableDescriptor]

'forceResolveAnnotationsInside' @ [564:9] ==> private final fun forceResolveAnnotationsInside(element: KtElement): Unit defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'anonymousInitializer' @ [564:39] ==> value-parameter anonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[ValueParameterDescriptorImpl]

'trace' @ [566:16] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.initializerAdditionalResolve[LocalVariableDescriptor]

'element' @ [570:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.forceResolveAnnotationsInside[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [570:17] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (KtAnnotationEntry) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'it' @ [570:76] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.forceResolveAnnotationsInside.<anonymous>[ValueParameterDescriptorImpl]

'resolveSession' @ [571:13] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'bindingContext' @ [571:28] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'ANNOTATION' @ [571:58] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [571:70] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.forceResolveAnnotationsInside.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [571:78] ==> @InlineOnly public inline fun <T, R> AnnotationDescriptor.let(block: (AnnotationDescriptor) -> (AnnotationDescriptor..AnnotationDescriptor?)): (AnnotationDescriptor..AnnotationDescriptor?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'forceResolveAllContents' @ [572:34] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: AnnotationDescriptor): (AnnotationDescriptor..AnnotationDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AnnotationDescriptor

'it' @ [572:58] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.forceResolveAnnotationsInside.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'SimpleGlobalContext' @ [583:29] ==> public constructor SimpleGlobalContext(storageManager: StorageManager, exceptionTracker: ExceptionTracker) defined in org.jetbrains.kotlin.context.SimpleGlobalContext[DeserializedClassConstructorDescriptor]

'resolveSession' @ [583:49] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'storageManager' @ [583:64] ==> public open val storageManager: LazyResolveStorageManager defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'resolveSession' @ [583:80] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'exceptionTracker' @ [583:95] ==> public final val ResolveSession.exceptionTracker: ExceptionTracker[MyPropertyDescriptor]

'resolveSession' @ [584:22] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [584:37] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'createContainerForBodyResolve' @ [585:16] ==> public fun createContainerForBodyResolve(moduleContext: ModuleContext, bindingTrace: BindingTrace, platform: TargetPlatform, statementFilter: StatementFilter, targetPlatformVersion: TargetPlatformVersion, languageVersionSettings: LanguageVersionSettings): StorageComponentContainer defined in org.jetbrains.kotlin.frontend.di[DeserializedSimpleFunctionDescriptor]

'globalContext' @ [586:17] ==> val globalContext: SimpleGlobalContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[LocalVariableDescriptor]

'withProject' @ [586:31] ==> public fun GlobalContext.withProject(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'file' @ [586:43] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'project' @ [586:48] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'withModule' @ [586:57] ==> public fun ProjectContext.withModule(module: ModuleDescriptor): ModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'module' @ [586:68] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[LocalVariableDescriptor]

'trace' @ [587:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'targetPlatform' @ [588:17] ==> private final val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'statementFilter' @ [589:17] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'file' @ [590:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'jvmTarget' @ [590:22] ==> public val KtElement.jvmTarget: JvmTarget defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'file' @ [591:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createBodyResolver[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [591:22] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'get' @ [592:11] ==> public inline fun <reified T : Any> ComponentProvider.get(): BodyResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BodyResolver

'resolveSession' @ [597:16] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'storageManager' @ [597:31] ==> public open val storageManager: LazyResolveStorageManager defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'createSafeTrace' @ [597:46] ==> @NotNull public abstract fun createSafeTrace(@NotNull p0: BindingTrace): BindingTrace defined in org.jetbrains.kotlin.storage.LazyResolveStorageManager[JavaMethodDescriptor]

'DelegatingBindingTrace' @ [598:17] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, debugName: String, resolutionSubjectForMessage: Any?, filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'resolveSession' @ [598:40] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[PropertyDescriptorImpl]

'bindingContext' @ [598:55] ==> public final val ResolveSession.bindingContext: BindingContext[MyPropertyDescriptor]

'resolveElement' @ [598:99] ==> value-parameter resolveElement: KtElement defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createDelegatingTrace[ValueParameterDescriptorImpl]

'filter' @ [598:115] ==> value-parameter filter: BindingTraceFilter defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.createDelegatingTrace[ValueParameterDescriptorImpl]

'setOf' @ [605:55] ==> @InlineOnly public inline fun <T> setOf(): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'hashMapOf' @ [607:111] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtClassOrObject, ClassDescriptorWithResolutionScopes> /* = HashMap<KtClassOrObject, ClassDescriptorWithResolutionScopes> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtClassOrObject
    <V> -> ClassDescriptorWithResolutionScopes

'hashMapOf' @ [609:124] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtAnonymousInitializer, ClassDescriptorWithResolutionScopes> /* = HashMap<KtAnonymousInitializer, ClassDescriptorWithResolutionScopes> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtAnonymousInitializer
    <V> -> ClassDescriptorWithResolutionScopes

'hashMapOf' @ [611:115] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtSecondaryConstructor, ClassConstructorDescriptor> /* = HashMap<KtSecondaryConstructor, ClassConstructorDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtSecondaryConstructor
    <V> -> ClassConstructorDescriptor

'hashMapOf' @ [613:84] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtProperty, PropertyDescriptor> /* = HashMap<KtProperty, PropertyDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtProperty
    <V> -> PropertyDescriptor

'hashMapOf' @ [615:94] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtNamedFunction, SimpleFunctionDescriptor> /* = HashMap<KtNamedFunction, SimpleFunctionDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedFunction
    <V> -> SimpleFunctionDescriptor

'hashMapOf' @ [617:87] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtTypeAlias, TypeAliasDescriptor> /* = HashMap<KtTypeAlias, TypeAliasDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtTypeAlias
    <V> -> TypeAliasDescriptor

'hashMapOf' @ [619:126] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtDestructuringDeclarationEntry, PropertyDescriptor> /* = HashMap<KtDestructuringDeclarationEntry, PropertyDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtDestructuringDeclarationEntry
    <V> -> PropertyDescriptor

'invoke' @ [621:85] ==> public abstract operator fun invoke(p1: KtDeclaration): LexicalScope? defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [621:101] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.BodyResolveContextForLazy.getDeclaringScope[ValueParameterDescriptorImpl]

'hashMapOf' @ [623:81] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtScript, LazyScriptDescriptor> /* = HashMap<KtScript, LazyScriptDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtScript
    <V> -> LazyScriptDescriptor

'DataFlowInfo' @ [625:61] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [625:74] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'topDownAnalysisMode' @ [627:49] ==> private final val topDownAnalysisMode: TopDownAnalysisMode defined in org.jetbrains.kotlin.idea.project.ResolveElementCache.BodyResolveContextForLazy[PropertyDescriptorImpl]

