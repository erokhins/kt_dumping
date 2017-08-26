'RunLineMarkerContributor' @ [38:44] ==> public constructor RunLineMarkerContributor() defined in com.intellij.execution.lineMarker.RunLineMarkerContributor[JavaClassConstructorDescriptor]

'Run' @ [40:64] ==> public final val Run: (Icon..Icon?) defined in com.intellij.icons.AllIcons.RunConfigurations.TestState[JavaPropertyDescriptor]

'?:' @ [41:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TestStateStorage.Record?, right: TestStateStorage.Record): TestStateStorage.Record[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Record

'getInstance' @ [41:38] ==> public open fun getInstance(@NotNull p0: Project): (TestStateStorage..TestStateStorage?) defined in com.intellij.execution.TestStateStorage[JavaMethodDescriptor]

'project' @ [41:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[ValueParameterDescriptorImpl]

'getState' @ [41:59] ==> @Nullable public open fun getState(p0: (String..String?)): TestStateStorage.Record? defined in com.intellij.execution.TestStateStorage[JavaMethodDescriptor]

'url' @ [41:68] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[ValueParameterDescriptorImpl]

'defaultIcon' @ [41:83] ==> val defaultIcon: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[LocalVariableDescriptor]

'getMagnitude' @ [42:40] ==> public open fun getMagnitude(p0: Int): (TestStateInfo.Magnitude..TestStateInfo.Magnitude?) defined in com.intellij.execution.testframework.TestIconMapper[JavaMethodDescriptor]

'state' @ [42:53] ==> val state: TestStateStorage.Record defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[LocalVariableDescriptor]

'magnitude' @ [42:59] ==> public final val magnitude: Int defined in com.intellij.execution.TestStateStorage.Record[JavaPropertyDescriptor]

'when (magnitude) {
            TestStateInfo.Magnitude.ERROR_INDEX,
            TestStateInfo.Magnitude.FAILED_INDEX -> AllIcons.RunConfigurations.TestState.Red2
            TestStateInfo.Magnitude.PASSED_INDEX,
            TestStateInfo.Magnitude.COMPLETE_INDEX -> AllIcons.RunConfigurations.TestState.Green2
            else -> defaultIcon
        }' @ [43:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon?, entry1: Icon?, entry2: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon?

'magnitude' @ [43:22] ==> val magnitude: (TestStateInfo.Magnitude..TestStateInfo.Magnitude?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[LocalVariableDescriptor]

'ERROR_INDEX' @ [44:37] ==> enum entry ERROR_INDEX defined in com.intellij.execution.testframework.sm.runner.states.TestStateInfo.Magnitude[FakeCallableDescriptorForObject]

'FAILED_INDEX' @ [45:37] ==> enum entry FAILED_INDEX defined in com.intellij.execution.testframework.sm.runner.states.TestStateInfo.Magnitude[FakeCallableDescriptorForObject]

'Red2' @ [45:90] ==> public final val Red2: (Icon..Icon?) defined in com.intellij.icons.AllIcons.RunConfigurations.TestState[JavaPropertyDescriptor]

'PASSED_INDEX' @ [46:37] ==> enum entry PASSED_INDEX defined in com.intellij.execution.testframework.sm.runner.states.TestStateInfo.Magnitude[FakeCallableDescriptorForObject]

'COMPLETE_INDEX' @ [47:37] ==> enum entry COMPLETE_INDEX defined in com.intellij.execution.testframework.sm.runner.states.TestStateInfo.Magnitude[FakeCallableDescriptorForObject]

'Green2' @ [47:92] ==> public final val Green2: (Icon..Icon?) defined in com.intellij.icons.AllIcons.RunConfigurations.TestState[JavaPropertyDescriptor]

'defaultIcon' @ [48:21] ==> val defaultIcon: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getTestStateIcon[LocalVariableDescriptor]

'element' @ [53:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [53:35] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'declaration' @ [54:13] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'nameIdentifier' @ [54:25] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [54:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[ValueParameterDescriptorImpl]

'declaration' @ [56:13] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'declaration' @ [56:48] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'declaration' @ [59:13] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [59:25] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [61:23] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[ValueParameterDescriptorImpl]

'project' @ [61:31] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'component1' @ [63:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [63:19] ==> public final operator fun component2(): TestFramework defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (declaration) {
            is KtClassOrObject -> {
                val lightClass = declaration.toLightClass() ?: return null
                val framework = TestFrameworks.detectFramework(lightClass) ?: return null
                if (!framework.isTestClass(lightClass)) return null
                val qualifiedName = lightClass.qualifiedName ?: return null

                "java:suite://$qualifiedName" to framework
            }

            is KtNamedFunction -> {
                val lightMethod = declaration.toLightMethods().firstOrNull() ?: return null
                val lightClass = lightMethod.containingClass as? KtLightClass ?: return null
                val framework = TestFrameworks.detectFramework(lightClass) ?: return null
                if (!framework.isTestMethod(lightMethod)) return null

                "java:test://${lightClass.qualifiedName}.${lightMethod.name}" to framework
            }

            else -> return null
        }' @ [63:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<String, TestFramework>, entry1: Pair<String, TestFramework>, entry2: Pair<String, TestFramework>): Pair<String, TestFramework>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<String, TestFramework>

'declaration' @ [63:38] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'declaration' @ [65:34] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'toLightClass' @ [65:46] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'?:' @ [66:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TestFramework?, right: TestFramework): TestFramework[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TestFramework

'detectFramework' @ [66:48] ==> @Nullable public open fun detectFramework(@NotNull p0: PsiClass): TestFramework? defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'lightClass' @ [66:64] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'!' @ [67:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'framework' @ [67:22] ==> val framework: TestFramework defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'isTestClass' @ [67:32] ==> public abstract fun isTestClass(@NotNull p0: PsiElement): Boolean defined in com.intellij.testIntegration.TestFramework[JavaMethodDescriptor]

'lightClass' @ [67:44] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'lightClass' @ [68:37] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'qualifiedName' @ [68:48] ==> public final val KtLightClass.qualifiedName: String?[MyPropertyDescriptor]

'to' @ [70:17] ==> public infix fun <A, B> String.to(that: TestFramework): Pair<String, TestFramework> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> TestFramework

'qualifiedName' @ [70:32] ==> val qualifiedName: String defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'framework' @ [70:50] ==> val framework: TestFramework defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'declaration' @ [74:35] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'toLightMethods' @ [74:47] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [74:64] ==> public fun <T> List<PsiMethod>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'lightMethod' @ [75:34] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'containingClass' @ [75:46] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'?:' @ [76:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TestFramework?, right: TestFramework): TestFramework[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TestFramework

'detectFramework' @ [76:48] ==> @Nullable public open fun detectFramework(@NotNull p0: PsiClass): TestFramework? defined in com.intellij.codeInsight.TestFrameworks[JavaMethodDescriptor]

'lightClass' @ [76:64] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'!' @ [77:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'framework' @ [77:22] ==> val framework: TestFramework defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'isTestMethod' @ [77:32] ==> public abstract fun isTestMethod(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.testIntegration.TestFramework[JavaMethodDescriptor]

'lightMethod' @ [77:45] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'to' @ [79:17] ==> public infix fun <A, B> String.to(that: TestFramework): Pair<String, TestFramework> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> TestFramework

'lightClass' @ [79:32] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'qualifiedName' @ [79:43] ==> public final val KtLightClass.qualifiedName: String?[MyPropertyDescriptor]

'lightMethod' @ [79:60] ==> val lightMethod: PsiMethod defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'name' @ [79:72] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'framework' @ [79:82] ==> val framework: TestFramework defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'getTestStateIcon' @ [85:20] ==> private final fun getTestStateIcon(url: String, project: Project): Icon? defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor[SimpleFunctionDescriptorImpl]

'url' @ [85:37] ==> val url: String defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'project' @ [85:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'framework' @ [85:54] ==> val framework: TestFramework defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'icon' @ [85:64] ==> public final val TestFramework.icon: Icon[MyPropertyDescriptor]

'Info' @ [86:41] ==> public constructor Info(p0: (Icon..Icon?), @Nullable p1: (((PsiElement..PsiElement?)) -> (String..String?))?, @NotNull p2: (Array<(AnAction..AnAction?)>..Array<out (AnAction..AnAction?)>)) defined in com.intellij.execution.lineMarker.RunLineMarkerContributor.Info[SamAdapterClassConstructorDescriptor]

'icon' @ [86:46] ==> val icon: Icon defined in org.jetbrains.kotlin.idea.highlighter.KotlinTestRunLineMarkerContributor.getInfo[LocalVariableDescriptor]

'getActions' @ [86:83] ==> @JvmStatic @JvmOverloads public final fun getActions(order: Int = ...): Array<AnAction> defined in com.intellij.execution.lineMarker.ExecutorAction.Companion[DeserializedSimpleFunctionDescriptor]

