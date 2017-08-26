'processAnnotatedMembers' @ [49:16] ==> public final fun processAnnotatedMembers(annClass: PsiClass, useScope: SearchScope, preFilter: (KtAnnotationEntry) -> Boolean = ..., consumer: (KtDeclaration) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion[SimpleFunctionDescriptorImpl]

'p' @ [49:40] ==> value-parameter p: AnnotatedElementsSearch.Parameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'annotationClass' @ [49:42] ==> public final val AnnotatedElementsSearch.Parameters.annotationClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'p' @ [49:59] ==> value-parameter p: AnnotatedElementsSearch.Parameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'scope' @ [49:61] ==> public final val AnnotatedElementsSearch.Parameters.scope: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'when (declaration) {
                is KtClass -> {
                    val lightClass = declaration.toLightClass()
                    consumer.process(lightClass)
                }
                is KtNamedFunction, is KtConstructor<*> -> {
                    val wrappedMethod = LightClassUtil.getLightClassMethod(declaration as KtFunction)
                    consumer.process(wrappedMethod)
                }
                is KtProperty -> {
                    val backingField = LightClassUtil.getLightClassBackingField(declaration)
                    if (backingField != null) {
                        return@processAnnotatedMembers consumer.process(backingField)
                    }

                    LightClassUtil.getLightClassPropertyMethods(declaration).all { consumer.process(it) }
                }
                else -> true
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'declaration' @ [50:19] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [52:38] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'toLightClass' @ [52:50] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'consumer' @ [53:21] ==> value-parameter consumer: Processor<PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'process' @ [53:30] ==> public abstract fun process(p0: (PsiModifierListOwner..PsiModifierListOwner?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'lightClass' @ [53:38] ==> val lightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[LocalVariableDescriptor]

'LightClassUtil' @ [56:41] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [56:56] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [56:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'consumer' @ [57:21] ==> value-parameter consumer: Processor<PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'process' @ [57:30] ==> public abstract fun process(p0: (PsiModifierListOwner..PsiModifierListOwner?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'wrappedMethod' @ [57:38] ==> val wrappedMethod: PsiMethod? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[LocalVariableDescriptor]

'LightClassUtil' @ [60:40] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassBackingField' @ [60:55] ==> public final fun getLightClassBackingField(declaration: KtDeclaration): PsiField? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [60:81] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [61:25] ==> val backingField: PsiField? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[LocalVariableDescriptor]

'consumer' @ [62:56] ==> value-parameter consumer: Processor<PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'process' @ [62:65] ==> public abstract fun process(p0: (PsiModifierListOwner..PsiModifierListOwner?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'backingField' @ [62:73] ==> val backingField: PsiField? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[LocalVariableDescriptor]

'getLightClassPropertyMethods' @ [65:36] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [65:65] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [65:78] ==> public inline fun <T> Iterable<PsiMethod>.all(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'consumer' @ [65:84] ==> value-parameter consumer: Processor<PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute[ValueParameterDescriptorImpl]

'process' @ [65:93] ==> public abstract fun process(p0: (PsiModifierListOwner..PsiModifierListOwner?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [65:101] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.execute.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [73:34] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'assert' @ [79:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'annClass' @ [79:20] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[ValueParameterDescriptorImpl]

'isAnnotationType' @ [79:29] ==> public final val PsiClass.isAnnotationType: Boolean[MyPropertyDescriptor]

'PsiBasedClassResolver' @ [81:41] ==> public constructor PsiBasedClassResolver(target: PsiClass) defined in org.jetbrains.kotlin.idea.search.PsiBasedClassResolver[DeserializedClassConstructorDescriptor]

'annClass' @ [81:63] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[ValueParameterDescriptorImpl]

'annClass' @ [82:33] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[ValueParameterDescriptorImpl]

'qualifiedName' @ [82:42] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'getKotlinAnnotationCandidates' @ [84:30] ==> private final fun getKotlinAnnotationCandidates(annClass: PsiClass, useScope: SearchScope): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion[SimpleFunctionDescriptorImpl]

'annClass' @ [84:60] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[ValueParameterDescriptorImpl]

'useScope' @ [84:70] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[ValueParameterDescriptorImpl]

'candidates' @ [85:25] ==> val candidates: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'notKtAnnotationEntry' @ [86:21] ==> private final fun notKtAnnotationEntry(found: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion[SimpleFunctionDescriptorImpl]

'elt' @ [86:42] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'runReadAction' @ [88:30] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'elt' @ [89:25] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'!' @ [90:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [90:26] ==> public abstract operator fun invoke(p1: KtAnnotationEntry): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'elt' @ [90:36] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'elt' @ [92:39] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'getStrictParentOfType' @ [92:43] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'elt' @ [94:49] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'calleeExpression' @ [94:53] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [94:71] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'let' @ [94:103] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> ImpreciseResolveResult): ImpreciseResolveResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> ImpreciseResolveResult

'psiBasedClassResolver' @ [95:25] ==> val psiBasedClassResolver: PsiBasedClassResolver defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'canBeTargetReference' @ [95:47] ==> public final fun canBeTargetReference(ref: KtSimpleNameExpression): ImpreciseResolveResult defined in org.jetbrains.kotlin.idea.search.PsiBasedClassResolver[DeserializedSimpleFunctionDescriptor]

'ref' @ [95:68] ==> value-parameter ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'psiBasedResolveResult' @ [98:25] ==> val psiBasedResolveResult: ImpreciseResolveResult? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'NO_MATCH' @ [98:50] ==> enum entry NO_MATCH defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[FakeCallableDescriptorForObject]

'psiBasedResolveResult' @ [99:25] ==> val psiBasedResolveResult: ImpreciseResolveResult? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'UNSURE' @ [99:50] ==> enum entry UNSURE defined in org.jetbrains.kotlin.asJava.ImpreciseResolveResult[FakeCallableDescriptorForObject]

'elt' @ [100:39] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'analyze' @ [100:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [100:67] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [101:52] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'get' @ [101:60] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), p1: (KtAnnotationEntry..KtAnnotationEntry?)): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'ANNOTATION' @ [101:79] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'elt' @ [101:91] ==> val elt: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'annotationDescriptor' @ [103:38] ==> val annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'fqName' @ [103:59] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'fqName' @ [104:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'asString' @ [104:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'annotationFQN' @ [104:50] ==> val annotationFQN: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'!' @ [107:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [107:26] ==> public abstract operator fun invoke(p1: KtDeclaration): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [107:35] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers.<no name provided>[LocalVariableDescriptor]

'!' @ [111:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [111:22] ==> val result: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.processAnnotatedMembers[LocalVariableDescriptor]

'runReadAction' @ [119:20] ==> public fun <T> runReadAction(action: () -> Collection<PsiElement>): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<PsiElement>

'useScope' @ [120:21] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'annClass' @ [121:32] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'name' @ [121:41] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'emptyList' @ [121:56] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'KotlinSourceFilterScope' @ [122:33] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'sourcesAndLibraries' @ [122:57] ==> @JvmStatic public final fun sourcesAndLibraries(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'useScope' @ [122:77] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'annClass' @ [122:87] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'project' @ [122:96] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'getInstance' @ [123:51] ==> public open fun getInstance(): (KotlinAnnotationsIndex..KotlinAnnotationsIndex?) defined in org.jetbrains.kotlin.idea.stubindex.KotlinAnnotationsIndex[JavaMethodDescriptor]

'get' @ [123:65] ==> @NotNull public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<(KtAnnotationEntry..KtAnnotationEntry?)>..Collection<(KtAnnotationEntry..KtAnnotationEntry?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinAnnotationsIndex[JavaMethodDescriptor]

'name' @ [123:69] ==> val name: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates.<no name provided>[LocalVariableDescriptor]

'annClass' @ [123:75] ==> value-parameter annClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'project' @ [123:84] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'scope' @ [123:93] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates.<no name provided>[LocalVariableDescriptor]

'useScope' @ [126:25] ==> value-parameter useScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates[ValueParameterDescriptorImpl]

'scope' @ [126:55] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'flatMap' @ [126:61] ==> public inline fun <T, R> Array<out (PsiElement..PsiElement?)>.flatMap(transform: ((PsiElement..PsiElement?)) -> Iterable<KtAnnotationEntry>): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> KtAnnotationEntry

'it' @ [126:71] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.getKotlinAnnotationCandidates.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [126:74] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtAnnotationEntry) -> Boolean = ...): List<KtAnnotationEntry> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'found' @ [131:17] ==> value-parameter found: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[ValueParameterDescriptorImpl]

'getVirtualFile' @ [133:47] ==> @Nullable public open fun getVirtualFile(@Nullable p0: PsiElement?): VirtualFile? defined in com.intellij.psi.util.PsiUtilCore[JavaMethodDescriptor]

'found' @ [133:62] ==> value-parameter found: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[ValueParameterDescriptorImpl]

'LOG' @ [134:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion[PropertyDescriptorImpl]

'error' @ [134:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'faultyContainer' @ [134:61] ==> val faultyContainer: VirtualFile? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[LocalVariableDescriptor]

'found' @ [134:87] ==> value-parameter found: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[ValueParameterDescriptorImpl]

'faultyContainer' @ [135:17] ==> val faultyContainer: VirtualFile? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[LocalVariableDescriptor]

'faultyContainer' @ [135:44] ==> val faultyContainer: VirtualFile? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[LocalVariableDescriptor]

'isValid' @ [135:60] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'getInstance' @ [136:32] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'requestReindex' @ [136:46] ==> public abstract fun requestReindex(@NotNull p0: VirtualFile): Unit defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'faultyContainer' @ [136:61] ==> val faultyContainer: VirtualFile? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion.notKtAnnotationEntry[LocalVariableDescriptor]

