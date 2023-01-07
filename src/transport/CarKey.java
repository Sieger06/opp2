package transport;

public class CarKey {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public CarKey(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public CarKey() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return this.remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return this.keylessAccess;
        }
}