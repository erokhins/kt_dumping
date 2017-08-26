'getScopeRestrictedByFileTypes' @ [32:34] ==> @NotNull @Contract public open fun getScopeRestrictedByFileTypes(@NotNull p0: GlobalSearchScope, @NotNull vararg p1: (FileType..FileType?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'param' @ [32:64] ==> value-parameter param: ClassesWithAnnotatedMembersSearch.Parameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.getScope[ValueParameterDescriptorImpl]

'annotationClass' @ [32:70] ==> public final val ClassesWithAnnotatedMembersSearch.Parameters.annotationClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'project' @ [32:86] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'allScope' @ [32:94] ==> public fun Project.allScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [32:121] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'hashSetOf' @ [36:25] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KtClassOrObject> /* = HashSet<KtClassOrObject> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'KotlinAnnotatedElementsSearcher' @ [37:16] ==> public companion object defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher[FakeCallableDescriptorForObject]

'processAnnotatedMembers' @ [37:48] ==> public final fun processAnnotatedMembers(annClass: PsiClass, useScope: SearchScope, preFilter: (KtAnnotationEntry) -> Boolean = ..., consumer: (KtDeclaration) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinAnnotatedElementsSearcher.Companion[SimpleFunctionDescriptorImpl]

'queryParameters' @ [37:72] ==> value-parameter queryParameters: ClassesWithAnnotatedMembersSearch.Parameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute[ValueParameterDescriptorImpl]

'annotationClass' @ [37:88] ==> public final val ClassesWithAnnotatedMembersSearch.Parameters.annotationClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'queryParameters' @ [38:72] ==> value-parameter queryParameters: ClassesWithAnnotatedMembersSearch.Parameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute[ValueParameterDescriptorImpl]

'scope' @ [38:88] ==> public final val ClassesWithAnnotatedMembersSearch.Parameters.scope: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'it' @ [39:74] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [39:77] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'processed' @ [39:125] ==> val processed: HashSet<KtClassOrObject> /* = HashSet<KtClassOrObject> */ defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute[LocalVariableDescriptor]

'declaration' @ [40:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [40:39] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'if (ktClass != null && processed.add(ktClass)) {
                val lightClass = ktClass.toLightClass()
                if (lightClass != null) consumer.process(lightClass) else true
            }
            else
                true' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'ktClass' @ [41:17] ==> val ktClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[LocalVariableDescriptor]

'processed' @ [41:36] ==> val processed: HashSet<KtClassOrObject> /* = HashSet<KtClassOrObject> */ defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute[LocalVariableDescriptor]

'add' @ [41:46] ==> public open fun add(element: KtClassOrObject): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ktClass' @ [41:50] ==> val ktClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[LocalVariableDescriptor]

'ktClass' @ [42:34] ==> val ktClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[LocalVariableDescriptor]

'toLightClass' @ [42:42] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'if (lightClass != null) consumer.process(lightClass) else true' @ [43:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'lightClass' @ [43:21] ==> val lightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[LocalVariableDescriptor]

'consumer' @ [43:41] ==> value-parameter consumer: Processor<PsiClass> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute[ValueParameterDescriptorImpl]

'process' @ [43:50] ==> public abstract fun process(p0: (PsiClass..PsiClass?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'lightClass' @ [43:58] ==> val lightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinClassesWithAnnotatedMembersSearcher.execute.<anonymous>[LocalVariableDescriptor]

