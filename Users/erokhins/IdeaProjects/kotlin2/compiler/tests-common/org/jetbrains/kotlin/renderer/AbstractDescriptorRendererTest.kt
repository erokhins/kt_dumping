'KotlinTestWithEnvironment' @ [46:49] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'container' @ [48:16] ==> value-parameter container: ComponentProvider defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.getDescriptor[ValueParameterDescriptorImpl]

'get' @ [48:26] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'resolveToDescriptor' @ [48:48] ==> @NotNull public open fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'declaration' @ [48:68] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.getDescriptor[ValueParameterDescriptorImpl]

'CompilerEnvironment' @ [52:17] ==> public object CompilerEnvironment : TargetEnvironment defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'loadFile' @ [55:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [55:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [55:47] ==> value-parameter path: String defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [56:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [56:36] ==> public final val AbstractDescriptorRendererTest.project: Project[MyPropertyDescriptor]

'createFile' @ [56:45] ==> public final fun createFile(text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fileText' @ [56:56] ==> val fileText: String defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'TopDownAnalyzerFacadeForJVM' @ [58:23] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'createContextWithSealedModule' @ [58:51] ==> public final fun createContextWithSealedModule(project: Project, configuration: CompilerConfiguration): MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[DeserializedSimpleFunctionDescriptor]

'project' @ [58:81] ==> public final val AbstractDescriptorRendererTest.project: Project[MyPropertyDescriptor]

'environment' @ [58:90] ==> public final val AbstractDescriptorRendererTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'configuration' @ [58:102] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'createContainerForLazyResolve' @ [60:25] ==> public fun createContainerForLazyResolve(moduleContext: ModuleContext, declarationProviderFactory: DeclarationProviderFactory, bindingTrace: BindingTrace, platform: TargetPlatform, targetPlatformVersion: TargetPlatformVersion, targetEnvironment: TargetEnvironment, languageVersionSettings: LanguageVersionSettings): StorageComponentContainer defined in org.jetbrains.kotlin.frontend.di[DeserializedSimpleFunctionDescriptor]

'context' @ [61:17] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'FileBasedDeclarationProviderFactory' @ [62:17] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'context' @ [62:53] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'storageManager' @ [62:61] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'listOf' @ [62:77] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'psiFile' @ [62:84] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'NoScopeRecordCliBindingTrace' @ [63:48] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[DeserializedClassConstructorDescriptor]

'JvmPlatform' @ [64:17] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'JVM_1_6' @ [65:27] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'targetEnvironment' @ [66:17] ==> protected open val targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[PropertyDescriptorImpl]

'DEFAULT' @ [67:45] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'container' @ [70:30] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'get' @ [70:40] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'context' @ [72:9] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'initializeModuleContents' @ [72:17] ==> public open fun initializeModuleContents(packageFragmentProvider: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedSimpleFunctionDescriptor]

'resolveSession' @ [72:42] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'packageFragmentProvider' @ [72:57] ==> public final val ResolveSession.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'ArrayList' @ [74:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'psiFile' @ [76:9] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'accept' @ [76:17] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'KtVisitorVoid' @ [76:33] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'file' @ [78:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'packageFqName' @ [78:35] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'!' @ [79:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqName' @ [79:22] ==> val fqName: FqName defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtFile[LocalVariableDescriptor]

'isRoot' @ [79:29] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'context' @ [80:45] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'module' @ [80:53] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'getPackage' @ [80:60] ==> public open fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'fqName' @ [80:71] ==> val fqName: FqName defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtFile[LocalVariableDescriptor]

'descriptors' @ [81:21] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [81:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'packageDescriptor' @ [81:37] ==> val packageDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtFile[LocalVariableDescriptor]

'file' @ [83:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'acceptChildren' @ [83:22] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'this' @ [83:37] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'parameter' @ [87:40] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[ValueParameterDescriptorImpl]

'parent' @ [87:50] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [87:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (declaringElement) {
                    is KtFunctionType -> return
                    is KtNamedFunction ->
                        addCorrespondingParameterDescriptor(getDescriptor(declaringElement, container) as FunctionDescriptor, parameter)
                    is KtPrimaryConstructor -> {
                        val ktClassOrObject: KtClassOrObject = declaringElement.getContainingClassOrObject()
                        val classDescriptor = getDescriptor(ktClassOrObject, container) as ClassDescriptor
                        addCorrespondingParameterDescriptor(classDescriptor.unsubstitutedPrimaryConstructor!!, parameter)
                    }
                    else -> super.visitParameter(parameter)
                }' @ [88:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaringElement' @ [88:23] ==> val declaringElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[LocalVariableDescriptor]

'addCorrespondingParameterDescriptor' @ [91:25] ==> private final fun addCorrespondingParameterDescriptor(functionDescriptor: FunctionDescriptor, parameter: KtParameter): Unit defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[SimpleFunctionDescriptorImpl]

'getDescriptor' @ [91:61] ==> protected open fun getDescriptor(declaration: KtDeclaration, container: ComponentProvider): DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[SimpleFunctionDescriptorImpl]

'declaringElement' @ [91:75] ==> val declaringElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[LocalVariableDescriptor]

'container' @ [91:93] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'parameter' @ [91:127] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[ValueParameterDescriptorImpl]

'declaringElement' @ [93:64] ==> val declaringElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[LocalVariableDescriptor]

'getContainingClassOrObject' @ [93:81] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'getDescriptor' @ [94:47] ==> protected open fun getDescriptor(declaration: KtDeclaration, container: ComponentProvider): DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [94:61] ==> val ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[LocalVariableDescriptor]

'container' @ [94:78] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'addCorrespondingParameterDescriptor' @ [95:25] ==> private final fun addCorrespondingParameterDescriptor(functionDescriptor: FunctionDescriptor, parameter: KtParameter): Unit defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [95:61] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [95:77] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'parameter' @ [95:112] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[ValueParameterDescriptorImpl]

'super' @ [97:29] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitParameter' @ [97:35] ==> public open fun visitParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'parameter' @ [97:50] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitParameter[ValueParameterDescriptorImpl]

'accessor' @ [102:32] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[ValueParameterDescriptorImpl]

'property' @ [102:41] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'getDescriptor' @ [103:42] ==> protected open fun getDescriptor(declaration: KtDeclaration, container: ComponentProvider): DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[SimpleFunctionDescriptorImpl]

'property' @ [103:56] ==> val property: KtProperty defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[LocalVariableDescriptor]

'container' @ [103:66] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'if (accessor.isGetter) {
                    descriptors.add(propertyDescriptor.getter!!)
                }
                else {
                    descriptors.add(propertyDescriptor.setter!!)
                }' @ [104:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'accessor' @ [104:21] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[ValueParameterDescriptorImpl]

'isGetter' @ [104:30] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'descriptors' @ [105:21] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [105:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'propertyDescriptor' @ [105:37] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[LocalVariableDescriptor]

'getter' @ [105:56] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'descriptors' @ [108:21] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [108:33] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'propertyDescriptor' @ [108:37] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[LocalVariableDescriptor]

'setter' @ [108:56] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'accessor' @ [110:17] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitPropertyAccessor[ValueParameterDescriptorImpl]

'acceptChildren' @ [110:26] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'this' @ [110:41] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'initializer' @ [114:17] ==> value-parameter initializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'acceptChildren' @ [114:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[JavaMethodDescriptor]

'this' @ [114:44] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'getDescriptor' @ [118:34] ==> protected open fun getDescriptor(declaration: KtDeclaration, container: ComponentProvider): DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[SimpleFunctionDescriptorImpl]

'element' @ [118:48] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'container' @ [118:57] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'descriptors' @ [119:17] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [119:29] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [119:33] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'descriptor' @ [120:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'element' @ [122:25] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'!' @ [122:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [122:57] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'hasExplicitPrimaryConstructor' @ [122:65] ==> public open fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [123:29] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [123:40] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'descriptors' @ [124:29] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [124:41] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [124:45] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [124:56] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'element' @ [128:17] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'acceptChildren' @ [128:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'this' @ [128:40] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'element' @ [132:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [132:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [132:40] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'functionDescriptor' @ [136:50] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.addCorrespondingParameterDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [136:69] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'valueParameterDescriptor' @ [137:25] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.addCorrespondingParameterDescriptor[LocalVariableDescriptor]

'name' @ [137:50] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameter' @ [137:58] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.addCorrespondingParameterDescriptor[ValueParameterDescriptorImpl]

'nameAsName' @ [137:68] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'descriptors' @ [138:25] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'add' @ [138:37] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'valueParameterDescriptor' @ [138:41] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.addCorrespondingParameterDescriptor[LocalVariableDescriptor]

'parameter' @ [141:17] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>.addCorrespondingParameterDescriptor[ValueParameterDescriptorImpl]

'acceptChildren' @ [141:27] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'this' @ [141:42] ==> <this> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<no name provided>[LazyClassReceiverParameterDescriptor]

'DescriptorRenderer' @ [145:24] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [145:43] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'classifierNamePolicy' @ [146:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'FULLY_QUALIFIED' @ [146:57] ==> public object FULLY_QUALIFIED : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'modifiers' @ [147:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [147:25] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [147:52] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

'annotationArgumentsRenderingPolicy' @ [148:13] ==> public abstract var annotationArgumentsRenderingPolicy: AnnotationArgumentsRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'UNLESS_EMPTY' @ [148:85] ==> enum entry UNLESS_EMPTY defined in org.jetbrains.kotlin.renderer.AnnotationArgumentsRenderingPolicy[FakeCallableDescriptorForObject]

'descriptors' @ [150:35] ==> val descriptors: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'map' @ [150:47] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'renderer' @ [150:53] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'render' @ [150:62] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [150:69] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [150:75] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DocumentImpl' @ [152:24] ==> public constructor DocumentImpl(@NotNull p0: String) defined in com.intellij.openapi.editor.impl.DocumentImpl[JavaClassConstructorDescriptor]

'psiFile' @ [152:37] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'text' @ [152:45] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'assertSameLines' @ [153:26] ==> public open fun assertSameLines(expected: (String..String?), actual: (String..String?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'getLastCommentedLines' @ [153:58] ==> public open fun getLastCommentedLines(@NotNull document: Document): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'document' @ [153:80] ==> val document: DocumentImpl defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'renderedDescriptors' @ [153:91] ==> val renderedDescriptors: String defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest.doTest[LocalVariableDescriptor]

'createEnvironmentWithMockJdk' @ [157:16] ==> @NotNull protected/*protected and package*/ open fun createEnvironmentWithMockJdk(@NotNull configurationKind: ConfigurationKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest[JavaMethodDescriptor]

'JDK_ONLY' @ [157:63] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

