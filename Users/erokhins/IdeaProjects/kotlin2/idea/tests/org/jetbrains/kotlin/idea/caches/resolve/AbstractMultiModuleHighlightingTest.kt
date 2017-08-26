'AbstractMultiHighlightingTest' @ [27:54] ==> public constructor AbstractMultiHighlightingTest() defined in org.jetbrains.kotlin.idea.stubs.AbstractMultiHighlightingTest[ClassConstructorDescriptorImpl]

'!' @ [30:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [30:49] ==> public final val AbstractMultiModuleHighlightingTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [30:54] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [30:59] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'checkFiles' @ [32:9] ==> protected final fun checkFiles(shouldCheckFile: () -> Boolean, check: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'shouldCheckFile' @ [32:20] ==> value-parameter shouldCheckFile: () -> Boolean = ... defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.checkHighlightingInAllFiles[ValueParameterDescriptorImpl]

'checkHighlighting' @ [33:13] ==> public open fun checkHighlighting(p0: (Editor..Editor?), p1: Boolean, p2: Boolean): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[JavaMethodDescriptor]

'myEditor' @ [33:31] ==> protected/*protected and package*/ final var myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[JavaPropertyDescriptor]

'MOCK_JDK' @ [41:44] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'module' @ [43:28] ==> protected final fun module(name: String, jdk: TestJdkKind, hasTestRoot: Boolean): Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'jdk' @ [43:45] ==> value-parameter jdk: TestJdkKind = ... defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'commonModule' @ [44:9] ==> val commonModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'createFacet' @ [44:22] ==> public fun Module.createFacet(platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs in file AbstractMultiModuleTest.kt[SimpleFunctionDescriptorImpl]

'Common' @ [44:53] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'withStdlibCommon' @ [45:13] ==> value-parameter withStdlibCommon: Boolean = ... defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'commonModule' @ [46:13] ==> val commonModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'addLibrary' @ [46:26] ==> protected final fun Module.addLibrary(jar: File, name: String, kind: PersistentLibraryKind<*>?): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'stdlibCommonForTests' @ [46:59] ==> @NotNull public open fun stdlibCommonForTests(): File defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'CommonLibraryKind' @ [46:90] ==> public object CommonLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'platforms' @ [49:26] ==> value-parameter vararg platforms: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'when (platform) {
                is TargetPlatformKind.Jvm -> "jvm"
                is TargetPlatformKind.JavaScript -> "js"
                else -> error("Unsupported platform: $platform")
            }' @ [50:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'platform' @ [50:30] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'error' @ [53:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'platform' @ [53:55] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'module' @ [55:34] ==> protected final fun module(name: String, jdk: TestJdkKind, hasTestRoot: Boolean): Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'path' @ [55:41] ==> val path: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'jdk' @ [55:47] ==> value-parameter jdk: TestJdkKind = ... defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[ValueParameterDescriptorImpl]

'platformModule' @ [56:13] ==> val platformModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'createFacet' @ [56:28] ==> public fun Module.createFacet(platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs in file AbstractMultiModuleTest.kt[SimpleFunctionDescriptorImpl]

'platform' @ [56:40] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'platformModule' @ [57:13] ==> val platformModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'enableMultiPlatform' @ [57:28] ==> protected final fun Module.enableMultiPlatform(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'platformModule' @ [58:13] ==> val platformModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'addDependency' @ [58:28] ==> protected final fun Module.addDependency(other: Module, dependencyScope: DependencyScope, exported: Boolean): Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

'commonModule' @ [58:42] ==> val commonModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'invoke' @ [59:13] ==> public abstract operator fun invoke(p1: Module, p2: TargetPlatformKind<*>): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'platformModule' @ [59:29] ==> val platformModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'platform' @ [59:45] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest.doMultiPlatformTest[LocalVariableDescriptor]

'checkHighlightingInAllFiles' @ [62:9] ==> protected open fun checkHighlightingInAllFiles(shouldCheckFile: () -> Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractMultiModuleHighlightingTest[SimpleFunctionDescriptorImpl]

